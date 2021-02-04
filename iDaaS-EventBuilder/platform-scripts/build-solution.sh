# Change Directory to solution on local machine
echo $PWD
echo "iDAAS - Event Builder Distribution"
cd $PWD
cd ../

/usr/local/bin/mvn clean install
echo "Maven Build Completed"
/usr/local/bin/mvn package
echo "Maven Release Completed"
cd target
cp idaas-*.jar idaas-eventbuilder.jar
echo "Copied Release Specific Version to General version"

