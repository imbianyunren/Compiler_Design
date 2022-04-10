COMPILE = java
CLASS_GEN = javac
FLAG1 = -jar
FLAG2 = -cp
FLAG3 = :.
TOOL = ../antlr-3.5.2-complete-no-st3.jar
SRC = myLexer.g
SRC2 = *.java
SRC_TOKEN = testLexer
all: 
	$(COMPILE) $(FLAG1) $(TOOL) $(SRC)
	$(CLASS_GEN) $(FLAG2) $(TOOL)$(FLAG3) $(SRC2) 
	$(COMPILE) $(FLAG2) $(TOOL)$(FLAG3) $(SRC_TOKEN) sample1.c > output1.txt
	$(COMPILE) $(FLAG2) $(TOOL)$(FLAG3) $(SRC_TOKEN) sample2.c > output2.txt
	$(COMPILE) $(FLAG2) $(TOOL)$(FLAG3) $(SRC_TOKEN) sample3.c > output3.txt
clean:
	rm -f *.tokens
	rm -f *.class