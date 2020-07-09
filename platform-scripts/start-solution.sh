./start_Kafka.sh &

echo "The current working directory: $PWD"
cd ..
echo "The current working directory: $PWD"
cd target
echo "The current working directory: $PWD"
java -jar idaas-connect-clinical-industrystds-1.5.0-SNAPSHOT.jar