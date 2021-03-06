CSCI-56 Final Project - Surveys Galore
========================================

About
------

This mobile web application, built with Grails along with jQuery Mobile,
allows a user to create surveys and publish them for other users to take.
Upon a successful login, the landing page lists all completed, incomplete and published surveys created by the logged in user.
Here, the user is also able to create a new survey.
This page is also accessed via the My Surveys tab in the footer.

Complete surveys can either have more questions added and saved or be published.
Incomplete surveys can have more questions added and then can be completed.
Published surveys are available to all users of the application.
In addition, published surveys which do not have any survey results associated, can be deactivated to be edited.

The surveys fall within the following categories:

    - Customer
    - Education
    - Entertainment
    - Employment
    - Marketing
    - Medical
    - Technology
    - Other

The All Surveys tab has a list of all published surveys of all users that a logged in user can take.
This is done by navigating to the survey from the list view to the chosen survey and then taking the survey.

The Results tab has the results of surveys, which were created and published by the logged in user, taken by all other users.
Upon viewing each individual survey results, one can export the results in the following formats:

    - CSV
    - XLS
    - PDF
    - RTF
    - XML

A user can logout of the application at anytime by clicking the Logout button present in the header bar at the top right corner.
Based on the current page, a user may be prompted about logging out without saving any changes.

During the startup of the application, a sample user and sample surveys (complete, incomplete & published) are created for testing.

    - Username: user@user.com,
    - Password: password


Features
---------

    - Register (Register a new user)
    - Forgot Password (Allows user to reset password)
    - Login (Login to the Survey application)
    - My Surveys Tab in footer (Lists logged in user's completed, incomplete and published surveys
    - All Surveys Tab in footer (Lists published surveys of all users)
    - Results Tab in footer (Lists all published surveys results, i.e. published surveys of logged in user)
    - Export of Results (Allows export to CSV, XLS, PDF, RTF or XML)


Project Structure
------------------

    - Project Root
        - grails-app
            - conf (All conf files required for the Survey application)
            - controllers (All controller classes in the edu.harvard.cscie56.finalproject package)
            - domain (All domain classes in the edu.harvard.cscie56.finalproject package)
            - services (All service classes in the edu.harvard.cscie56.finalproject package)
            - views (All GSPs for the Survey application)
        - src
            - groovy (Utility class in the edu.harvard.cscie56.finalproject package)
            - templates
                -war
                    web.xml (Added entry for springSecurityFilterChain)
        - test
            - unit (All unit test classes in the edu.harvard.cscie56.finalproject package)
        - web-app
            - css
                - custom (Contains custom css file for the application)
                - jquery (Contains jQuery Mobile css files)
            - js
                - application.js (Custom file created for the application)
                - jquery (Contains jQuery Mobile js files)


Instructions
-------------

    - Download the zip file for this project from https://github.com/beebha/FinalProjectV1 (Download ZIP on RHS of page)
    - Unzip the folder and via a terminal prompt navigate to the unzipped folder and cd into it.
    - Run the following command "grails compile"
    - Run the following command to run the application "grails run-app".
    - Open either the iOS simulator or Android simulator and access the following URL:
        - http://localhost:8090/FinalProjectV1
    - Run the following command for all unit tests with code coverage "grails test-app -coverage"
        - Navigate to the target folder to view the test results and code coverage
