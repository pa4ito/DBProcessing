## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## Main Steps:

0. Go to proper directory:
    cd /usr/tmp/plamen/CHExt:

1. Create a DDL dictionary and a record description by typing:
    cd tools
    gtacl -p ddl < ddlch
    gtacl -p ddl < ddlpac

2. Use ddl2java to generate Input and Output classes by typing:
   ./ddl2java -i itemch -dpath /G/applc/jddldict -d ../src/dpkg -p dpkg
   ./ddl2java -i itempac -dpath /G/applc/jddldict -d ../src/dpkg -p dpkg

3. Check the PATH and add the path to java:
echo "$PATH"

export PATH=$PATH:/usr/tandem/nssjava/jdk180_h80


4. cd src/dpkg
    /usr/tandem/nssjava/jdk180_h80/bin/javac -cp ".:../../lib/*" -d ../../bin *.java
    cd ..
    /usr/tandem/nssjava/jdk180_h80/bin/javac -cp ".:../lib/*" -d ../bin *.java


-- /usr/tmp/plamen/CHExt/bin: java -cp ".:../lib/*" CHRead 5169766222701841
/usr/tmp/plamen/CHExt/bin: /usr/tandem/nssjava/jdk180_h80/bin/java -cp ".:../lib/*" CHRead 1111111111111111112

/usr/tmp/plamen/CHExt/bin: /usr/tandem/nssjava/jdk180_h80/bin/java -cp ".:../lib/*" CHCopy 975 978

/usr/tmp/plamen/CHExt/bin: java -cp ".:../lib/*" CHThreads 975 978

/usr/tmp/plamen/DBProcessing java -jar DBProcessing.jar 975 978 9000000001000000
/usr/tmp/plamen/DBProcessing java -cp ".:../lib/*" Main 975 978 9000000001000000
