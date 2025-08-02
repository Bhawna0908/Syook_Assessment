## Project Overview

This is a login automation framework developed using:
- Java
- Selenium WebDriver
- Maven
- Cucumber (BDD)
- TestNG

The framework automates the login functionalities of the [Syook Bugbash Platform](https://bugbash.syook.com).

---

## Project Architecture

syook-ui-automation/
│
├── src/
│   ├── main/
│   │   ├── java/                     
│   │   └── resources/               
│   │
│   └── test/
│       ├── java/
│       │   ├── runners/             
│       │   └── stepdefinitions/    
│       │
│       └── resources/
│           └── Login.feature        
│
├── target/                         
├── .gitignore                      
├── pom.xml                         
└── README.md                        


# Prerequisites

Before you begin, ensure you have the following installed:

| Tool              | Version / Notes              |
|-------------------|------------------------------|
| Java              | JDK 17+                      |
| Maven             | 3.6+                         |
| IntelliJ IDEA     | or Eclipse                   |
| Git               | Git Bash or Git CLI          |
| Google Chrome     | Latest version               |
| ChromeDriver      | Match your browser version   |

---

## Setup Instructions

1. **Clone the repo**:
   ```bash
   git clone https://github.com/Bhawna0908/Syook_Assessment.git
   cd syook-ui-automation
Import into IntelliJ:

Open IntelliJ

File → Open → Select syook-ui-automation folder

Wait for Maven to resolve dependencies (pom.xml)


In DriverFactory or BaseTest, ensure ChromeDriver path matches your local system or is in your system PATH.

Run Maven install:

bash
Copy code
mvn clean install
▶️ How to Execute Tests
1. Run All Scenarios
   bash
   Copy code
   mvn test
2. Run Specific Feature File
   In your TestRunner.java, use @CucumberOptions like:

java
Copy code
features = "src/test/resources/features/Login.feature"
3. Run Tests with Tags
   bash
   Copy code
   mvn test -Dcucumber.filter.tags="@login"
   #Test Data Management
   Test data can be maintained in:

Feature files (for small static inputs)

.properties or .json files (for dynamic/configurable data)

External data loading is handled in utility classes (DataReader, etc.)

📊 Test Report Interpretation
By default, Cucumber reports are generated in:

bash
Copy code
target/cucumber-reports/
Report Types:
HTML Report:
Open target/cucumber-reports/cucumber-html-reports/overview-features.html

JSON Report:
Located in target/cucumber.json



🔄 CI/CD Integration
You can integrate with Jenkins or GitHub Actions for scheduled or trigger-based runs. Sample Jenkinsfile and GitHub Action YAML can be added later.

🤝 Contribution Guidelines
Fork the repository

Create a new branch: feature/your-feature-name

Commit changes and push

Create a Pull Request

📧 Contact
For issues, suggestions or contributions, please contact:
bhawna mehra – Automation QA Engineer
Email: bhawnamehra4@gmail.com
GitHub: https://github.com/Bhawna0908

