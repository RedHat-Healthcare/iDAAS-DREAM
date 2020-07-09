_mydir='/Users/alscott/RedHatTech/kafka_2.12-2.4.0.redhat-00005'
#_mydir='/Users/developer/RedHatTech/kafka_2.12-2.4.0.redhat-00005'

cd $_mydir
# cd /Users/developer/RedHatTech/kafka_2.12-2.4.0.redhat-00005
bin/kafka-topics.sh --list --bootstrap-server localhost:9092 &

