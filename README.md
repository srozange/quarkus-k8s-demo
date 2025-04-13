# Lancement en mode dev
mvn compile quarkus:dev

# Build du jar
mvn package

# Exec natif
mvn package -Pnative

# Exec natif via docker
mvn package -Pnative -Dquarkus.native.container-build=true -Dnative-image.xmx=12g -DskipTests=true

# Lancement du jar
java -jar target/quarkus-app/quarkus-run.jar

# Build de l'image native
docker image build -f src/main/docker/Dockerfile.native -t srozange/todo-app .

# Minikube
# Extensions

minikube tunnel (à lancer avant le apply)
kubectl apply -f target/kubernetes/minikube.yml

mvn quarkus:list-extensions
mvn quarkus:add-extension -Dextensions="minikube"

dans le pom :

    <dependency>
      <groupId>io.quarkus</groupId>
      <artifactId>quarkus-minikube</artifactId>
    </dependency>
# Lancement en mode dev
mvn compile quarkus:dev

# Build du jar
mvn package

# Exec natif
mvn package -Pnative

# Exec natif via docker
mvn package -Pnative -Dquarkus.native.container-build=true -Dnative-image.xmx=12g -DskipTests=true

# Lancement du jar
java -jar target/quarkus-app/quarkus-run.jar

# Build de l'image native
docker image build -f src/main/docker/Dockerfile.native -t srozange/todo-app .

# Minikube
# Extensions

minikube tunnel (à lancer avant le apply)
kubectl apply -f target/kubernetes/minikube.yml

mvn quarkus:list-extensions
mvn quarkus:add-extension -Dextensions="minikube"

dans le pom :

    <dependency>
      <groupId>io.quarkus</groupId>
      <artifactId>quarkus-minikube</artifactId>
    </dependency>

