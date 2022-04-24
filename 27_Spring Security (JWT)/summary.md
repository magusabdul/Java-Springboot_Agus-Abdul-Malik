# 27 Spring Security (JWT)

## RESUME MATERI
1. Dependencies
2. Struktur Folder MVC 
3. Membuat kelas-kelas yang akan di gunakan

### Dependencies
Required Dependencies
- Spring Web
Build web
- Spring Security
kustomisasi authentication dan akses kontrol 
- PostgreSQL Driver
PostgreSQL JDBC dan R2DBC driver
- Spring Data JPA
data persisten di SQL dengan java Persistance API menggunakan spring data dan hibernate
- Lombok 
anotasi library java untuk memudahkan reduce bilerplate code
- JJWT 
io jsonwebtoken.jjwt sebagai generator dan validasi jwt

Menambahkan depedensi JJWT
```xml
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-api</artifactId>
    <version>0.11.2</version>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-impl</artifactId>
    <version>0.11.2</version>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-jackson</artifactId> 
    <!-- or jjwt-gson if 6son is preferred -->
    <version>0.11.2</version>
    <scope>runtime</scope>
</dependency>
```

### Struktur Folder MVC 
- Config\
kumpulan konfigurasu, security, bean
- Controller\
sebagai kumpulan routing rest API atau endpoint
- Model\
bentuk dasar bussines mode, POJO(Plain Old Java Object)
- Repository\
interface yang berhubungan langsung dengan database
- Security\
penyedia token jwt, security filter
- Service\
kumpulan interface digunkan untuk bussines process/rules/logic

Konfigurasi datasource di application.properties
```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/spring_security
spring.datasource.username=postgres
spring.datasource.password=1945

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
```

User default dari basic security spring boot adalah username=user dan password nya di generate otomatis dapat di lihat di terminal saat pertamakali menjalankan aplikasi

Test Endpoint
```bash
$ curl http://localhost:8080/users
Response :
{"timestamp":"2021-11-03T16:42:49.952+00:00","status":401,"error":"Un
authorized", "path":"/users"}
```
Akses dengan user dan password
```bash

$ curl
http://user:e46a0473-c984-460e-9040-a1ba36733a89@localhost:8080/
users
```

Mengganti default user, tambahkan kode berikut di application.properties
```bash
spring.security.user.name = admin
spring.security.user.password = 85fdd5ff-c541-48b7-a4ad-f5c3521cc5cf
```

### Membuat kelas-kelas yang akan di gunakan
mengganti default user dengan multiple user dengan menambahkan kelas UserConfig
```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfig {
    @Bean
    public UserDetailsService users(){
        UserDetails admin = User.builder().username("admin").password("{noop}password").roles("ADMIN").build();
        UserDetails user = User.builder().username("user").password("{bcrypt}$2a$04$MzVXtd4o0y4DOlyHMMLMDeE4/eezrsT5Xad.2lmGr/NkCpwBgvn3e").roles("ADMIN").build();  // yawinpassword

        return new InMemoryUserDetailsManager(admin, user);
    }
}
```

Password Encoder\
Sangat disarankan menggunakan BCryptPasswordEncoder()
```java
String idForEncode = "bcrypt";

Map encoders = new HashMap <>();
encoders . put (idForEncode, new BCryptPasswordEncoder());
encoders . put("noop", NoOpPasswordEncoder . getInstance());
encoders . put("pokdf2", new Pbkdf2PasswordEncoder());
encoders . put("scrypt", new SCryptPasswordEncoder());
encoders . put("sha256", new StandardPasswordEncoder());

PasswordEncoder passwordEncoder =
new DelegatingPasswordEncoder(idForEncode, encoders);
```
Dokumentasi : https://docs.spring.io/spring-security/site/docs/current/reference/html5/%23authentication-password-storage-dpe

Contoh Hasil Password Encoder
```bash
(1) {bcrypt}$2a$10$dXJ3SW6G7P501 GmMkkmwe. 20cQQubK3. HZWzG3YBItlRy. favM/BG 

(2) {noop}password 

(3) {pbkdf2}5d923b44a6d129f3ddf3e3c8d29412723dcbde72445eef6bf3b508fbf17fa4ed4d6b99ca763d8dc 

(4) {scrypt}$e0801$8bWJaSu2IKSn9Z9KM+TPXfOc/9bdYSrN1oD9qfVThWEwdRTn07re7i+fUZRJ68k91TyuTeUp4of4924hHnazw==$0ADec 

(5) {sha256}028ad898ebc02e690819fa220e88c620699403e94fff291cfffaf8410849f27605abcbc0 
```

Membuat kelas USER\
Sebelum membuat json web token, perlu membuat entity class user untuk
manyimpan data user. Untuk object class kali ini sedikit berbeda, karena kita harus implement UserDetails interface yang digunakan di core spring security.

```java
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User implements UserDetails{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role;
    @Column(columnDefinition = "boolean default true")
    private boolean active = true;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return null;
    }

    public Long getId(){
        return this.id;
    }
    
    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return this.active;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return this.active;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return this.active;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return this.active;
    }    
}
```

membuat user repository
```java
import com.magusabdul.spingjjwt.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{  
    User getDistinctTopByUsername(String username);
}
```

Membuat kelas JWT Provider
```java
import com.magusabdul.spingjjwt.model.User;

import java.security.Key;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.Keys;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class JwtTokenProvider {
    private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    @Value("600000")
    private Long expirantion = 1000L * 60 * 60; // ms * s * m = 1 jam

    public String generateToken(Authentication authentication){
        final User user = (User) authentication.getPrincipal();

        Date now = new Date(System.currentTimeMillis());
        Date expiryDate = new Date(now.getTime() + expirantion);

        Map<String, Object> claims = new HashMap<>();
        claims.put("username", user.getUsername());

        return Jwts.builder().setId(user.getId().toString()).setSubject(user.getUsername()).setClaims(claims).setIssuedAt(now).setExpiration(expiryDate).signWith(key).compact();
    }
    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return true;
        } catch (SignatureException ex) {
            log.error("Invalid Jwt Signature: {}", ex.getMessage());
        } catch (MalformedJwtException ex) {
            log.error("Invalid Jwt Token: {}", ex.getMessage());
        } catch (ExpiredJwtException ex) {
            log.error("Expired Jwt Token: {}", ex.getMessage());
        } catch (UnsupportedJwtException ex) {
            log.error("Unsupported Jwt Token: {}", ex.getMessage());
        } catch (IllegalArgumentException ex) {
            log.error("Jwt claim string is empty: {}", ex.getMessage());
        }
        return false;
    }
    public String getUsername(String token){
        Claims claims = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
        return claims.get("username").toString();
    }
}
```

Membuat interface UserService
```java
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{ }
```

Membuat interface UserServiceImpl
```java
import com.magusabdul.spingjjwt.model.User;
import com.magusabdul.spingjjwt.repository.UserRepository;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getDistinctTopByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException("Username Not Found");
        }
        return user;
    }
}
```

Membuat kelas SecurityFilter
```java
import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import org.springframework.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
@RequiredArgsConstructor
public class SecurityFilter extends OncePerRequestFilter{
    private static final String JWT_HEADER = "Authorization";
    private static final String JWT_TOKEN_PREFIX = "Bearer";

    private final UserDetailsService userDetailsService;
    private final JwtTokenProvider jwtTokenProvider;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        try {
            String token = getJWTFromRequest(request);
            if (token != null && !token.isBlank() && jwtTokenProvider.validateToken(token)) {
                String username = jwtTokenProvider.getUsername(token);
                log.info("username : {}", username);
                UserDetails user = userDetailsService.loadUserByUsername(username);
                UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                    user, user.getPassword(), user.getAuthorities()
                    );
                authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);           
        }
        filterChain.doFilter(request, response);
    }
    
    private String getJWTFromRequest(HttpServletRequest request){
        String bearerToken = request.getHeader(JWT_HEADER);        
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith(JWT_TOKEN_PREFIX))
            return bearerToken.substring(7);
        return bearerToken;
        
    }
}
```

Membuat kelas SecurityConfig
```java
import com.magusabdul.spingjjwt.security.SecurityFilter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    private final UserDetailsService userDetailsService;
    private final SecurityFilter securityFilter;
    
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().antMatchers("/auth/**").permitAll().anyRequest().authenticated();
        // Remove sesion
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // Filter jwt
        http.addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
```

membuat object payload dengan membuat kelas UsernamePassword dan kelas ResponseToken
```java
import lombok.Data;

@Data
public class UsernamePassword {
    private String username;
    private String password;
}
```
```java
import lombok.Data;

@Data
public class TokenResponse {
    private String token;
}
```

Membuat kelas AuthService
```java
import com.magusabdul.spingjjwt.model.User;
import com.magusabdul.spingjjwt.payload.TokenResponse;
import com.magusabdul.spingjjwt.payload.UsernamePassword;

import org.springframework.stereotype.Component;

@Component
public interface AuthService {
    User register(UsernamePassword req);
    TokenResponse generateToken(UsernamePassword req);
}
```

Membuat kelas AuthServiceImpl
```java
import com.magusabdul.spingjjwt.model.User;
import com.magusabdul.spingjjwt.payload.TokenResponse;
import com.magusabdul.spingjjwt.payload.UsernamePassword;
import com.magusabdul.spingjjwt.repository.UserRepository;
import com.magusabdul.spingjjwt.security.JwtTokenProvider;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;

    @Override
    public User register(UsernamePassword req) {
        User user = new User();
        user.setUsername(req.getUsername());
        user.setPassword(passwordEncoder.encode(req.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public TokenResponse generateToken(UsernamePassword req) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                    req.getUsername(), req.getPassword()
                    )
            );
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtTokenProvider.generateToken(authentication);
            TokenResponse tokenResponse = new TokenResponse();
            tokenResponse.setToken(jwt);
            return tokenResponse;
        } catch (BadCredentialsException e) {
            log.error("Bad Credential", e);
            throw new RuntimeException(e.getMessage(), e);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
```

Membuat kelas AuthCOntroller
```java
import com.magusabdul.spingjjwt.payload.TokenResponse;
import com.magusabdul.spingjjwt.payload.UsernamePassword;
import com.magusabdul.spingjjwt.service.AuthService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UsernamePassword req){
        this.authService.register(req);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/token")
    public ResponseEntity<?> generateToken(@RequestBody UsernamePassword req){
        TokenResponse token = authService.generateToken(req);
        return ResponseEntity.ok(token);
    }
}
```

Testing
Setelah semuanya di buat, lakukan testing register, lalu create token, lalu hit endpoint menggunakan authorization token jwt

## TASK
Objective
- Implement JWT security in Springboot
### Problem 1 - JWT Generation
Buatlah project Springboot yang memiliki endpoint berikut!

Request
- URL = v2/auth/login
- Method = POST
- Body = 
```JSON
{
    "phone": "081234567890",
    "password": "123123123"
}
```

Response
- Status = 200
- Body = 
```JSON
{
    "data": {
        "token": "<JWT>"
    }
}
```
Catatan: Response token hanya jika phone dan password benar.

### Problem 2 - JWT Extraction
Tambahkan endpoint berikut pada project tersebut!

Request
- URL = v2/auth/info
- Method = GET
- Headers = Authorization: Bearer <JWT>

Response
- Status = 200
- Body = 
```JSON
{
    "data": {
        "phone": "081234567890"
    }
}
```
Catatan: Nomor HP pada response body diambil dari JWT.
