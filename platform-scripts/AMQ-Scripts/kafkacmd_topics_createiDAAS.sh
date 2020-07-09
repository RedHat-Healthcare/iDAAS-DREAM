_mydir='/Users/alscott/RedHatTech/kafka_2.12-2.4.0.redhat-00005'
#_mydir='/Users/developer/RedHatTech/kafka_2.12-2.4.0.redhat-00005'

cd $_mydir
## Operational Topics for Platform
bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic opsMgmt_PlatformTransactions &
## HL7
## Inbound to iDAAS Platform by Message Trigger
## Facility: MCTN
## Application: MMS
bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic MCTN_MMS_ADT &
## HL7
## Facility By Application by Message Trigger
## Facility: MCTN
## Application: MMS
## Routing transactions
bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic MCTN_MMS_ADT_Routing &
## FHIR
bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic FHIRSvr_Condition &
## FHIR
## Pardsed Data
bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic FHIRSvr_Condition_Parsed &

