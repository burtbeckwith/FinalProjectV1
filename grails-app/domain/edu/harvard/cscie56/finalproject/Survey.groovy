package edu.harvard.cscie56.finalproject

import edu.harvard.cscie56.finalproject.auth.User

class Survey {

    String name
    String category
    User user
    Date dateCreated

    static hasMany = [questions: Question, surveyResults: SurveyResult]

    static constraints = {
        name blank: false, unique: true
        category blank: false, inList: ["Customer", "Education", "Entertainment", "Marketing", "Medical", "Office", "Technology", "Other"]
    }
}
