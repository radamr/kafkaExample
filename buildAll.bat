pushd kafkaconsumer
cmd /c mvnw clean install -DskipTests
popd
pushd kafkaproducer
cmd /c mvnw clean install -DskipTests
popd