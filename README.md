Objective of the exercise: Develop an Android application with two screens: a registration form and a summary screen displaying the entered information.

Components used in the project:

EditText: For entering information (name, email, phone number, address).
Spinner: For selecting the city.
Button: For the "Submit" button.
TextView: To display the summary of the entered data.
Main steps of the Java code (Activity 1 - Registration Form):

Declare the variables for the UI elements (EditText, Spinner, Button).
Initialize these variables in the onCreate() method.
Implement an OnClickListener for the "Submit" button:
Retrieve the entered information.
Create an Intent to move to the next activity while transferring the data.
Start the new activity.
Main steps of the Java code (Activity 2 - Summary):

Retrieve the data from the Intent in the onCreate() method.
Format the received information into a string.
Display this string in the TextView for the summary.



https://github.com/user-attachments/assets/42b85b55-341c-4040-9b2b-1519d00c1611

