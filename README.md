Exam  creation service :
-----------------------
This exam creation service is an independet service to create a question paper based on the Exam Creator requirement.
When an Exam Creator needs to create an exam, that person needs to specify two things:

One is blueprint for the exam that specifies, the type of question, number of questions, their complexity levels.
Secons the students to whom the exam will be assigned.

Once the Exam Creator creates the Blueprint, the system automatically populates the examp paper with questions fetched from the Question Bank.
The Exam Creator can review and edit the Question paper, and when satisfied, save it.

;.

Note for developer:

About Spring boot application.

.In this project we have 4 main packages
>Domain ,service,controller,repository
>>In the domain package we declared been(QuestionPaper,CreateExam) classes which required for store questions and store student data.
(No need to create collections in mongoBD it automatically creates based on collection names which declred in the domain classes @Document annotation)
>>In repositiry package we have two interfaces they have databse connection with mongoDB to store student  data and store question paper.
>>In service we have methods implementation to store and retraive questions.
>>In Controller we have methods to control the browser operations.



About ExamUI 
*>Used React meterial-ui .

.In this we have three js files.
>Main,SearchQ,Blueprint
>>In main we have two component calls 1.SerchQ,2.Blueprint  ,By default this calling to SearchQ,If blue print is full and ready then it will render on the same page means main will call Blueprint.js file.
>>>In SearchQ.we have rest api calls to get data from the servers and two functionalities.
>>>In Blueprint we have one method that can help us to store the data into databse.
first run the spring application using SpringToolSuite(if no have install or run with commands). 
to run the ReactApp use the command npm start.it will run on 9000 pposrt number.


