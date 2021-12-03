# Jumbo_BDDFramework
Automation project created using selenium automation tool and BDD scenarios written in cucumber via java.

# Technologies Used:
1.  Selenium WebDriver with Java Language binding
2.  JDK 1.8
3.  Maven (Build tool) dependencies
4.  Maven Plugins
5.  Cucumber using TestNG
6.  Cucumber extent report 6 adapter
7.  Log4j2
8.  TestNG
9.  Eclipse (IDE)

# Project Components
I have design different components in this Framework:
1. Feature File
2. Step Definition Class
3. Configuration File
4. Cucumber Hooks with before and after scenarios
6. PDF Report
7. Parallel Test Runners in TestNG for prallel run
8. Page Class for POM
9. Maven with pom.xml with different dependencies and plugins

# Pre-requisite
      Ensure following plugins installed else follow below methods
      
      [1]Steps to add Eclipse cucumber plugin:
         From Eclipse, go to menu Help then select Install New software
         Work with: <[https://cucumber.github.io/cucumber-eclipse/update-site/]>
         Select the check-box for Cucumber Eclipse Plugin
         Select Next as per the instruction shown during installation.
         Restart your Eclipse after completion of instruction.
      
      [2]Download Maven from <http://maven.apache.org/download.cgi>
        download binray,zip file and extract to your local folder after that set 2 new environement variables
        ( M2_HOME and MAVEN_HOME with following path [C:\Program Files\apache-maven-3.8.1]
        and add following path in path variable [C:\Program Files\apache-maven-3.8.1\bin]

# How to use
1.  You can clone this repository
2.  open project in eclipse
3.  Update Maven project so that all dependencies get install
4.  Run ParallelTestRunner.java as testNG
5.  you can see the log in console after execution
6.  you can find the log file which show the steps and what value is used - [application<DateTime>.log] created at project root folder
7.  Open pdf report from following path [..\test output\PdfReport\TestRunReportPdf.pdf]
