package edu.harvard.cscie56.finalproject

import edu.harvard.cscie56.finalproject.auth.User

class SurveyUtils {

    public static getMyActiveSurveyCategoriesAndCount(User user)
    {
        def surveys = []
        // get all survey categories and number of surveys in each list
        for(singleCategory in Survey.constraints.category.inList) {

            def publishedSurveysOfLoggedInUser = Survey.findAllByUserAndCategoryAndCompleteAndActive(user, singleCategory, true, true)

            surveys.add([
                    category: singleCategory,
                    surveys: publishedSurveysOfLoggedInUser,
                    count: publishedSurveysOfLoggedInUser.size()
            ])
        }
        return surveys
    }

    public static getMyCompletedSurveyCategoriesAndCount(User user)
    {
        def surveys = []
        // get all survey categories and number of surveys in each list
        for(singleCategory in Survey.constraints.category.inList) {

            def completedSurveysOfLoggedInUser = Survey.findAllByUserAndCategoryAndCompleteAndActive(user, singleCategory, true, false)
            surveys.add([
                    category: singleCategory,
                    surveys: completedSurveysOfLoggedInUser,
                    count: completedSurveysOfLoggedInUser.size()
            ])
        }
        return surveys
    }

    public static getMyIncompleteSurveyCategoriesAndCount(User user)
    {
        def surveys = []
        // get all survey categories and number of surveys in each list
        for(singleCategory in Survey.constraints.category.inList) {

            def incompleteSurveysOfLoggedInUser = Survey.findAllByUserAndCategoryAndCompleteAndActive(user, singleCategory, false, false)

            surveys.add([
                    category: singleCategory,
                    surveys: incompleteSurveysOfLoggedInUser,
                    count: incompleteSurveysOfLoggedInUser.size()
            ])
        }
        return surveys
    }

    public static getAllSurveyCategoriesAndCount()
    {
        def surveys = []
        // get all survey categories and number of surveys in each list
        for(singleCategory in Survey.constraints.category.inList) {

            def publishedSurveys = Survey.findAllByCategoryAndCompleteAndActive(singleCategory, true, true)

            surveys.add([
                    category: singleCategory,
                    surveys: publishedSurveys,
                    count: publishedSurveys.size()
            ])
        }
        return surveys
    }

    public static getAllSurveyCategories()
    {
        Survey.constraints.category.inList
    }

    public static getAllQuestionTypes()
    {
        Question.constraints.type.inList
    }
}