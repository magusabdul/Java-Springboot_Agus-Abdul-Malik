# 37 Docker Container with Microservices

## Resume Materi
1. Pengenalan Docker
2. Docker command
3. Dockerfile, Docker Network, dan Dokcer log

### Pengenalan Docker
Outline:
- Pengenalan docker
- Perbedaan docker vs virtual machine
- docker concept
- docker command
- spring boot docker
- challenges

docker adalah salah satu paltform untuk membungkus suatu program atau aplikasi asalkan di instal docker engine

kelebihan docker
- protability
- performance
- agility
- isolation
- sclability

docker VS vm
- di dcker setiap aplikasi yang dirunning akan berada di container dan semua container di running di docker engine.
- di vm akan di running di guest os.

konsep docker
- dockerfile
- docker images
- docker container
- docker hub
- docker daemon
- docker engine
- docker registry
- docker compose
- docker swarm

### Docker command
- docker attach untuk membuat persistance volume
- docker build = Build an image from a Dockerfile
- docker builder = Manage builds
- docker checkpoint = Manage checkpoints
- docker commit = Create a new image from a container's changes
- docker config = Manage Docker configs
- docker container = Manage containers
- docker context = Manage contexts
- docker cp = Copy files/folders between a container and the local filesystem
- docker create = Create a new container
- docker diff = Inspect changes to files or directories on a container's filesystem
- docker events = Get real time events from the server
- docker exec = Run a command in a running container
- docker export = Export a container's filesystem as a tar archive
- docker history = Show the history of an image
- docker image = Manage images
- docker images = List images
- docker import = Import the contents from a tarball to create a filesystem image
- docker info = Display system-wide information
- docker inspect = Return low-level information on Docker objects
- docker kill = kill one or more running containers
- docker load = Load an image from a tar archive or STDIN
- docker login = Log in to a Docker registry
- docker logout = Log out from a Docker registry
- docker logs = Fetch the logs of a container
- docker manifest = Manage Docker image manifests and manifest lists
- docker network = Manage networks
- docker node = Manage Swarm nodes
- docker pause = Pause all processes within one or more containers
- docker plugin = Manage plugins
- docker port = List port mappings or a specific mapping for the container
- docker ps = List containers
- docker pull = Pull an image or a repository from a registry
- docker push = Push an image or a repository to a registry
- docker rename = Rename a container
- docker restart = Restart one or more containers
- docker rm = Remove one or more containers
- docker rmi = Remove one or more images
- docker run = Run a command in a new container
- docker save = Save one or more images to a tar archive (streamed to STDOUT by default)
- docker search = Search the Docker Hub for images
- docker secret = Manage Docker secrets
- docker service = Manage services
- docker stack = Manage Docker stacks
- docker start = Start one or more stopped containers
- docker stats = Display a live stream of container(s) resource usage statistics
- docker stop = Stop one or more running containers
- docker swarm = Manage Swarm
- docker system = Manage Docker
- docker tag = Create a tag TARGET_IMAGE that refers to SOURCE_IMAGE
- docker top = Display the running processes of a container
- docker trust = Manage trust on Docker images
- docker unpause = Unpause all processes within one or more containers
- docker update = Update configuration of one or more containers
- docker version = Show the Docker version information
- docker volume = Manage volumes
- docker wait = Block until one or more containers stop, then print their exit codes

### Dockerfile, Docker Network, dan Dokcer log 

Docker Dockerfile
```bash
FROM busybox
ENV FOO=/bar
WORKDIR ${FOO}
ADD . $FOO
COPY \$FOO /quux
```
```bash
docker build -t test/myapp
```

Docker Network
- bridge
- host
- overlay
- macvlan
- none
- Network plugins

Dokcer log 
```bash
docker run -name test -d busybox
```

## Task

### Membuat dokcer images Anda sendiri berdasarkan proyek SpringBoot menggunakan Dokcer