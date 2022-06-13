# 36 Graph QL with Spring Boot

## Resume materi
1. Pengenalan Graphql
2. Perbedaan graphql dan RESTful API
3. GraphQL Query dan Graphql Mutations

### Pengenalan Graphql
Outline
- GraphQL Definition
- Perbedaam GraphQL dam REST
- GraphQL Query dan mutations
- SpringBoot GraphQL
- Challenges

GraphQL

adalah sebuah bahasa query yang dapat digunakan untuk berkirim data dari satu aplikasi ke aplikasi lainnya

dengan graphql, aplikasi dapat mengetahui detail deskripsi dari masing-masing data yang tersedia pada aplikasi lainnya

Konsep-konsep dari GraphQL

GraphQl digunakan untuk request asynkronous 


### Perbedaan graphQL dan RESTful API
- Dengan graphql tidak ada lagi adanya under fetching
jadi ketika
- Mempermudah client untuk mendapatkan data karena dengan satu alamat url client dapat mengakses beberapa jenis data yang disediakan oleh server

### GraphQL Query dan Graphql Mutations
Di graphQL setiap method get akan menggunakan Query

kemudian jika method POS, PUT/PATCH, DELETE akan mengunakan mutations

GraphQL QUery adalah cara untuk client dapat menggambil data dari server

contoh
```bash
type QUery {
    me: user
}

type User {
    id: 10
    name: String
}
```

GraphQL mutation adalah kegiatan-kegiatan untuk untuk proses penulisan data

bagaiaman menggunakan graphQL pada spring

buat project springboot

tambahkan schema.graphqls
tambahkan beberapa entity
tambahkan beberapa controller
jalankan program
buka "url:8080/graphiql" untuk membuka graphiql

## Task

### Kita mempunyai struktur data seperti dibawah
```bash
type Post {
    id: ID!
    title: String!
    text: string!
    category: String
    author: Author!
}

type Author {
    id: ID!
    name: String!
    thumbnail: String
    posts: [Post]!
}

# The Root Query for the application
type Query 1 {
    recentPosts (count: Int, offset: Int) : [Post]!
}

# The Root Mutation for the application
type Mutation {
writePost (title: String!, text: String!, category: String) : Post!
}
```

Tulis graphql menggunakan skema diatas pada project springboo!
