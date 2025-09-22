compile:
	javac -d out org/tangibleideas/lab/MainClass.java

run: compile
	java -cp ./out/  org.tangibleideas.lab.MainClass