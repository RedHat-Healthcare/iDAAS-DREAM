_mydir='/Users/alscott/RedHatTech/kafka_2.12-2.4.0.redhat-00005'
#_mydir='/Users/developer/RedHatTech/kafka_2.12-2.4.0.redhat-00005'

cd $_mydir
## Operational Topics for Platform
bin/kafka-topics.sh --delete --bootstrap-server localhost:9092 --topic opsMgmt_PlatformTransactions &
## HL7
## Inbound to iDAAS Platform by Message Trigger
## Facility: MCTN
## Application: MMS
bin/kafka-topics.sh --delete --bootstrap-server localhost:9092 --topic MCTN_MMS_ADT &
## FHIR
bin/kafka-topics.sh --delete --bootstrap-server localhost:9092 --topic FHIRSvr_Condition &
## FHIR
## Ent.
bin/kafka-topics.sh --delete --bootstrap-server localhost:9092 --topic FHIRSvr_Condition &

