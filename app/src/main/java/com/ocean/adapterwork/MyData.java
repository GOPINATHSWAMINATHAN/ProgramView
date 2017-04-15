package com.ocean.adapterwork;

/**
 * Created by gopinath on 28/01/17.
 */

public class MyData {


    static String programs[][]=new String[50][];
    static String sourceprograms[][]= new String[50][];
    static int programoutput[][]=new int[50][];
    static int pos;
    static String programDescription[][]=new String[50][];
    static String[] nameArray={"Java Fundamental.", "Variables and Data Types.",
            "Operators and Expressions.", "Conditional Statements", "Looping Statements", "Arrays.",
            "Methods or Functions.", "Classes and Objects.", "Inheritance.", "Interfaces.",
            "Exception Handling.", "Multi-Threading.", "Wrapper Classes.", "Math Lib. Functions.",
            "String and StringBuffer.","Swing.", "Java Database Connectivity.", "Input/Output Streams.", "Generics.", "Collection Classes.", "Reflection.", "Nested Class.", "Java Beans.","Swing with JDBC"};
    //0  Java Fundamental
    //1  Variables and DataTypes
    //2  Operators and Expressions
    //3  Conditional Statements.
    //4  Looping Statements
    //5  Arrays
    //6 Methods or Functions
    //7 Classes or Objects
    //8 Inheritance
    //9 Packages(REMOVED)
    //10 Interfaces.
    //11 Exception Handling
    //12 Multi-threading
    //13 Wrapper classes
    //14 Math lib functions
    //15 String and StringBuffer
    //16 Swing
    //17 Java Database Connectivity
    //18 Input/Output Streams
    //19 Generics
    //20 Collection Classes
    //21 Reflection
    //22 Nested class
    //23 Java Beans

    static{
        programDescription[0]=new String[]{"Program to display Hello World","Program to Calculate Compound Interest","Program to find Area of Circle","Swapping of Two Numbers","Program to find the Leap Year","Program to find the Perfect Number","Program to find the Palindrome","Program to find the Reverse of a number","Program to find the factorial of a number","Program to find the armstrong number."};
        programDescription[1]=new String[]{"Program to declare the Variables","Program to explain the initialization of variable","Program to declare the variables with different data types","Program to explain the lifetime of a variable","Program to declare the constant variables","Program to find the ASCII values of a characters","Program to explain initilaize the float and double","Program to explain the integral data types","Program to explain the Narrowing","Program to explain static and instance variables","Program to explain widening"};
        programDescription[2]=new String[]{"Program to explain the working of Arithmetic Operators","Program to explain Automatic Type Conversion","Program to explain the concept of Pre-fixed and Post-fixed Increment Operator","Program to explain the logical Bitwise Operator","Program to explain the Relational Operator","Program to explain the TypeConversion|Explicit TypeCasting","Program to explain Assignment Operator","Program to explain Conditional Operator","Program to explain Unary Operator"};
        programDescription[3]=new String[]{"Program to explain the if-else statement","Program to explain if statement","Program to find the Leap Year","Program to explain the nested-if statement","Program to find the number is Odd/Even","Program to explain the switch statement","Program to understand the switch statement","Program to explain the nested else-if statement","Program to find the grade using else-if "};
        programDescription[4]=new String[]{"Program to find the fibonacci series","Program to explain the for loop","Program to explain for-each loop","Program to find the palindrome","Program to find the Prime Number","Program to find the reverse of a number","Program to find the Strong Number","Program to explain the while loop","Program to explain the do-while loop","Counting the digits of a given number using looping statement"};
        programDescription[5]=new String[]{"Program to display fibonacci series using array","Program to explain Bubble Sort","Program to explain Jagged Array","Program to explain Matrix Addition","Program to explain Selection Sort","Program to explain Two Dimensional Array","Program to explain an array with Scanner class","Program to find the elements ending with zero in an array","Program to explain Multi-dimensional array","Program to explain Removing Repeated Elements in an array."};
        programDescription[6]=new String[]{"Method without return type and without parameters","Method without return type and with parameters","Method with return type and without parameters","Method with return type and with parameters","Program to explain the Final Variable","Program to explain the Final Method","Program to explain the Constructor"};
        programDescription[7]=new String[]{"Program to explain the Constructor","Program to describe the Constructor","Program to explain the class and objects with Distance class","Program to explain passing object to Method","Program to explain the Constructor Overloading","Program to explain the this keyword","Program to describe the this keyword","Program to explain calling a another constructor from a constructor"};
        programDescription[8]=new String[]{"Program to explain the Single Inheritance","Program to describe the Single Inheritance with ContainerWeight class","Program to explain the Multilevel inheritance","Program to explain the Method Overriding","Program to explain about the final class","Program to explain about the final method","Program to explain the super keyword","Program to explain the Hierarchical Inheritance"};
        programDescription[9]=new String[]{"Program to use simple interface","Program to use field in interface","Program to explain Inheritance of a interface from multiple interface","Program to explain partial implementation of an interface","Program to implement a class from multiple interfaces","Program to implement application interface","Program to explain the calculation using interface","Program to implementing abstract methods from implementing multiple interfaces"};
        programDescription[10]=new String[]{"Program to explain the ArithmeticException","Program to explain try-catch block","Program to explain ChainedException","Program to explain Invalid-age Exception","Program to explain the final keyword","Program to explain Multiple catch block","Program to explain Multiple Exception","Program to explain Nested try-catch block","Program to explain throw keyword","Program to explain multiple catch"};
        programDescription[11]=new String[]{"Program to explain creating a thread","Program to explain the currentThread() Method","Program to explain getName() & getPriority() method","Program to explain setPriority() Method","Program to explain setPriority() with Counter class","Program to explain unsynchronized thread","Program to explain sleep() method","Program to explain the thread priority","Program to explain creating thread using Runnable interface","Program to explain creating multiple thread"};
        programDescription[12]=new String[]{"Program to use Simple Wrapper Class","Program to explain Auto-Boxing and Auto-Unboxing","Program to explain Wrapper class with function","Program to explain Wrapper class Boolean and Character","Program to use expression with Wrapper classes","Program to use Wrapper class with switch statement"};
        programDescription[13]=new String[]{"Program to explain the pow() method from Math Lib. Functions","Program to explain the sqrt() method from Math Lib. Functions","Program to explain the ceil() method from Math Lib. Functions","Program to explain the floor() method from Math Lib. Functions","Program to explain the random() method from Math Lib. Functions"};
        programDescription[14]=new String[]{"Program to explain String(char chars[],int startIndex,int numChars) constructor","Program to explain the String Constructor","Program to explain charAt() Method in String class","Program to explain the length() method","Program to explain equals() & equalsIgnoreCase() method","Program to explain getChars() method","Program to explain regionMatches() method","Program to explain split() method","Program to explain toLowerCase() method","Program to explain toUpperCase() method","Program to explain trim() method","Program to explain value() method","Program to explain the index() method","Program to explain String Buffer Constructor","Program to explain append() method","Program to explain capacity() method"};
        programDescription[15]=new String[]{"Program to use JFrame Component","Program to use JButton swing component with event","Program to use JLabel Component","Program to use JTextField Component","Program to use JPasswordField Component","Program to use JCheckBox","Program to use JList","Program to use JComboBox"};
        programDescription[16]=new String[]{"Program to display data from table using select query","Program to insert data into a table using insert query","Program to update the data into a table using update query","Program to delete field from table using delete query","Program to explain PreparedStatement"};
        programDescription[17]=new String[]{"Program to use File class and its method","Program to use FileReader class","Program to use FileWriter class to write a data into a file","Program to explain FileInputStream class","Program to explain FileOutputStream class","Program to explain BufferedReader class","Program to explain BufferedInputStream class","Program to explain Serialization","Program to explain de-Serialization"};
        programDescription[18]=new String[]{"Program to explain the Simple Generic Class","Program to explain Generic with Two Parameters","Generic method with Bounded Type","Generic Constructor","Generic Method","Generic Method with Bounded Type","Generic class with Bounded Type","Generic class with Wildcard","Generic subclass","Overriding method in Generics","Generic super and sub class","Generic sub class","Generic Interface"};
        programDescription[19]=new String[]{"Program to use Vector Collection class with Iterator interface","Program to use Stack Collection class with peek() and search() methods","Program to use Enumeration interface with Vector Collection class","Program to use ArrayList Collection class","Program to use ArrayList Collection class with ListIterator interface","Program to use LinkedList Collection class","Program to use LinkedList Collection class with ListIterator interface","Program to use SetCollection class with Iterator interface","Program to use HashMap Collection class","Program to use HashSet Collection class","Program to use TreeMap Collection class"};
        programDescription[20]=new String[]{"Program to use getDeclaredMethods()"};
        programDescription[21]=new String[]{"Program to use Nested class","Program to explain that private variable of Outer class can be accessible in Inner class but private variable of Inner class can not be accessible in Outer class","Program to create Inner class Object in Outer class","Program to explain static Inner class","Program to explain that the Inner class can be defined within the method, loop, if-block or any other block","Program to use Factory method to create Inner class objects"};
        programDescription[22]=new String[]{"Program to display insert the data into the database","Program to display retrieve the data from the database","Program to explain update the data into the database","Program to explain delete the data from the database"};
    }
    static {
        programs[0]=new String[]{"Hello World","Compound Interest","Area Of Circle","Swapping Program","Leap Year","Perfect Number","Palindrome","Reverse","Factorial","ArmStrong"};
        programs[1]=new String[]{"Variable Declaration","Initializing Variables","DataTypeDemo","DataTypes","Variables LifeTime","Constant Variables","ASCII value of Characters","Initialize float and double difference","Integral DataTypes","Narrowing","static and instance variables","Widening"};
        programs[2]=new String[]{"Arithmetic Operator","Auto Conversion","Increment Operator","Logical Bitwise","Modulus Operator","Relational Operator","Explicit TypeCast","Assignment Operator","Conditional Operator","Unary Opoerator"};
        programs[3]=new String[]{"IfElse","IfStatement","LeapYear","NestedIF","Odd-Even","Switch Statement","Switch Demo","Else-If Ladder"};
        programs[4]=new String[]{"Fibonacci","For-Loop","For-Each","Palindrome","Prime Number","Reverse Number","Strong Number","While Loop","Do-while loop","CountingDigits"};
        programs[5]=new String[]{"Array Fibonacci","Bubble Sort","Jagged Array","Matrix Addition","Selection Sort","Two-D Array","Array with Scanner","Ending with Zero elements","MultiDimensional","Removing Repeated Elements"};
        programs[6]=new String[]{"Without ReturnType and without parameters","Without ReturnType and with parameters","With ReturnType and without parameters","With ReturnType and with Return Type","Method Overloading","Method Overloading Type Two","Static Method with Return Type"};
        programs[7]=new String[]{"Constructor","ConstructorDemo","Distance","PassingObject","ConstructorOverloading","This Keyword","This KeywordDemo"};
        programs[8]=new String[]{"Single Inheritance","Single Inh with ContainerWeightClass","MultiLevel Inheritance","Method Overriding","Final Class","Final Method","super keyword","Hierarchical Inheritance"};
        programs[9]=new String[]{"Simple Interface","Interface with Field","Dynamic Method Dispatch with Interface","Implementing a class from Multiple Interface","Partial Implementation of Interface","Inheriting Interface from Multiple interface."};
        programs[10]=new String[]{"Arithmetic Exception","Try-Catch Demo","Chained Exception","Invalid Age Exception","Final Keyword","Multiple Catch","Multiple Exception","Nested Try-catch","Throw Keyword","Multiple Catch"};
        programs[11]=new String[]{"Creating Thread","currentThread() Method","Using getName() & getPriority().","setPriority()","setPriority() with Counter class","unsynchronized Thread","sleep() Method","Thread Priority","Creating Thread using Runnable","MultiThread"};
        programs[12]=new String[]{"Wrapper classes","Auto-boxing and auto-unboxing","Wrapper class in Function","Boolean and Character Wrappers","Expression with Wrapper class","Wrapper with switch"};
        programs[13]=new String[]{"pow() method","sqrt() method","ceil() method","floor() method","random() method"};
        programs[14]=new String[]{"String Constructor","String Concatenation","charAt() Method","length() method","equals() & equalsIgnoreCase Method","equalsIgnoreCase Method","getChars() method","regionMatches() method","split() method","toLowerCase() Method","toUpperCase() Method","trim() method","value() method","indexOf() Method","StringBuffer Constructor","append() method","capacity() method"};
        programs[15]=new String[]{"JFrame Component","JButton Component","JLabel Component","JTextField Component","JPasswordFieldComponent","JCheckBox Component","JList Component","JComboBox Component"};
        programs[16]=new String[]{"Select Query","Insert Query","Update Query","Delete Query","Prepared Statement"};
        programs[17]=new String[]{"Working With File","FileReader","FileWriter","FileInputStream","FileOutputStream","BufferedReader","BufferedInputStream","BufferedOutputStream","Serialization","De-Serialization"};
        programs[18]=new String[]{"Simple Generic class","Generic with Two Parameters","Generic method with Bounded Type","Generic Constructor","Generic Method","Generic Method with Bounded Type","Generic class with Bounded Type","Generic sub class","Overriding method in Generics","Generic super and sub class","Generics Subclass","Generic Interface"};
        programs[19]=new String[]{"Vector class with Iterator","Stack class","Vector class with Enumeration","ArrayList class","ArrayList class with ListIterator","LinkedList class","LinkedList class with ListIterator","TreeSet class","HashMap class","HashSet class","TreeMap class"};
        programs[20]=new String[]{"getDeclaredMethods() method.","getDeclaredMethods()","getDeclaredFields() method","getDeclaredFields()","getFields() method","getFields() method","getFields() and getType()","getSuperClass() method","getName() method","getReturnType() method"};
        programs[21]=new String[]{"Simple Nested class","Accessibility in Nested class","Creating Inner class Object","Inner class within loop or if-else","Factory method to create Object"};
        programs[22]=new String[]{"Insert the data with Swing and JDBC","Retrieve the data with Swing and JDBC","Update the data with Swing and JDBC","Delete the data with Swing and JDBC"};
    }


    static {
        sourceprograms[0]=new String[]{"HelloWorld.java","CompoundInterest.java","AreaOfCircle.java","Swap.java","LeapYear.java","PerfectNumber.java","Palindrome.java","ReverseNumber.java","Factorial.java","Armstrong.java"};
        sourceprograms[1]=new String[]{"VariableDeclare.java","VariableInitialization.java","DataTypeDemo.java","DataTypes.java","VariableLifeTime.java","ConstantVariables.java","CharDemo.java","DoubleDemo.java","IntegerPart.java","NarrowingDemo.java","VariableDemo.java","WideningDemo.java"};
        sourceprograms[2]=new String[]{"ArithmeticOperators.java","AutomaticConversion.java","IncrementOperator.java","LogicalBitwise.java","ModulusOperator.java","RelationalOperator.java","TypeCastExplicit.java","AssignmentDemo.java","ConditionalDemo.java","UnaryDemo.java"};
        sourceprograms[3]=new String[]{"IfElse.java","IfStatement.java","LeapYear.java","NestedIf.java","OddEven.java","SwitchStatement.java","SwitchDemo.java","ElseIfLadder.java","ElseifDemo.java"};
        sourceprograms[4]=new String[]{"FibonacciExample.java","ForExample.java","ForEachExample.java","Palindrome.java","PrimeNumber.java","ReverseNumber.java","StrongNumber.java","WhileExample.java","DoWhileExample.java","CountingDigits.java"};
        sourceprograms[5]=new String[]{"ArrayFibonacci.java","BubbleSort.java","JaggedArray.java","MatrixAddition.java","SelectionSort.java","TwoDArray.java","ArrayExampleTwo.java","EndingZeroFive.java","Multidimensional.java","RepeatedElementRemove.java"};
        sourceprograms[6]=new String[]{"MethodTypeFour.java","MethodTypeThree.java","MethodTypeTwo.java","MethodTypeOne.java","MethodOverloading.java","MethodOverloadThree.java","MethodOverloadTwo.java"};
        sourceprograms[7]=new String[]{"ConstructorDemo.java","ConstructorDemo2.java","Distance.java","PassingObjects.java","ConstructorOverloading.java","ThisKeyword.java","ThisKeywordDemo.java"};
        sourceprograms[8]=new String[]{"SingleInheritance.java","SingleInheritanceDemo.java.java","SuperInheritance.java","MethodOverriding.java","FinalClass.java","FinalVariable","FinalMethod.java","ConstructorCall.java"};
        sourceprograms[9]=new String[]{"Demo.java","Test.java","InterfaceDemo.java","MultipleInterfaceDemo.java","InterfaceTest7.java","Application.java","Calculation.java", "InterfaceTwo.java"};
        sourceprograms[10]=new String[]{"ArithmeticException.java","TryCatchDemo.java","ChainedException.java","InvalidAgeException.java","Finally.java","MultipleExceptionDemo.java","NestedTryCatchBlock.java","ThrowDemo.java","MultipleCatchDemo.java"};
        sourceprograms[11]=new String[]{"CreatingThread.java","CurrentThread.java","","SetPriority2.java","SetPriority1.java","UnsynchronizedThread.java","SleepMethodDemo.java","ThreadPriority.java","RunnableDemo.java","MultiThread.java"};
        sourceprograms[12]=new String[]{"WrapperDemo.java","WrapperDemo2.java","WrapperDemo3.java","WrapperDemo4.java","WrapperDemo5.java","WrapperDemo6.java"};
        sourceprograms[13]=new String[]{"Mpow.java","Msqrt.java","Mceil.java","Mfloor.java","Mrandom.java"};
        sourceprograms[14]=new String[]{"StringConstructor.java","StringConcat.java","CharAtExample.java","LengthExample.java","equalsIgnoreExample.java","EqualsIgnoreCaseExample.java","GetCharMethodExample.java","RegionMatchesMethod.java","SplitMethodExample.java","ToLowerCaseExample.java","ToUpperCaseExample.java","TrimMethod.java","ValueOfMethod.java","IndexOfMethod.java","StringBufferConstructor.java","AppendMethod.java","CapacityMethod.java"};
        sourceprograms[15]=new String[]{"JFrameTest.java","JButtonTest1.java","JLabelTest1.java","JTextFieldTest1.java","JPasswordFieldtest1.java","JCheckBoxTest1.java","JListTest1.java","JComboBoxTest1.java"};
        sourceprograms[16]=new String[]{"JdbcSelect.java","JdbcInsert.java","JdbcDelete.java","JdbcUpdate.java","JdbcPrepardStatement.java"};
        sourceprograms[17]=new String[]{"FileDemo.java","FileReaderDemo.java","FileWriterDemo.java","FileInputStreamDemo.java","FileOutputStreamDemo.java","BufferedReaderForInput.java","BufferedInputStreamDemo.java","BufferedOutputStreamDemo.java","BoxSerialization.java","BoxDeSerialization.java"};
        sourceprograms[18]=new String[]{"GenericTest1.java","GenericTest2.java","GenericTest4.java","GenericTest5.java","GenericTest7.java","GenericTest10.java","GenericTest11.java","GenericTest12.java","GenericTest15.java","GenericTest15c.java","GenericTest15e.java","GenericTest15f.java","GenericTest15j.java"};
        sourceprograms[19]=new String[]{"VectorText.java","StackTest.java","VectorTest5.java","ArrayList1.java","ArrayListClass.java","LinkedListTest1.java","LinkedListTest3.java","SetText1.java","MapTest2.java","TreeMap2.java"};
        sourceprograms[20]=new String[]{"ReflectionTest1.java","ReflectionTest2.java","ReflectionField.java","ReflectionField1.java","ReflectionField0.java","ReflectionField2.java","ReflectionField3.java","ReflectionTest3.java","ReflectionTest4.java","ReflectionTest5.java"};
        sourceprograms[21]=new String[]{"NestedClassOne.java","Outer.java","NestedClassThree.java","NestedClassFour.java","NestedClassFour.java","NestedClassTwenty.java","NestedClassNine.java"};
        sourceprograms[22]=new String[]{"StoreForm.java","RetriveForm.java","UpdateForm.java","DeleteForm.java"};
    }

 static
 {
     programoutput[0]=new int[]{R.drawable.areaofcircleoutput,R.drawable.compoundinterestoutput,R.drawable.helloworldoutput,R.drawable.swapoutput,R.drawable.leapyearfundamental,R.drawable.perfectnumberfundamentaloutput,R.drawable.palindromefundamentaloutput,R.drawable.reversenumberoutput,R.drawable.factorialoutput,R.drawable.armstrongfundamentaloutput};
     programoutput[1]=new int[]{R.drawable.variabledeclarationoutput,R.drawable.initializingvariableoutput,R.drawable.datatypedemooutput,R.drawable.datatypesoutput,R.drawable.variablelifetimeoutput,R.drawable.constantvariablesoutput,R.drawable.chardemooutput,R.drawable.doubledemooutput,R.drawable.integerpartoutput,R.drawable.narrowingdemooutput,R.drawable.variabledemooutput,R.drawable.wideningdemooutput};
     programoutput[2]=new int[]{R.drawable.incrementoperatoroutput,R.drawable.leapyearoutput,R.drawable.logicalbitwiseoutput,R.drawable.modulusoperatoroutput,R.drawable.nestedifoutput,R.drawable.relationaloperatoroutput,R.drawable.typecastoutput,R.drawable.assignmentdemooutput,R.drawable.conditionaldemooutput,R.drawable.unarydemooutput};
     programoutput[3]=new int[]{R.drawable.ifstatementoutput,R.drawable.ifelseoutput,R.drawable.leapyearoutput,R.drawable.nestedifoutput,R.drawable.oddevenoutput,R.drawable.switchstatementoutput,R.drawable.switchdemooutput,R.drawable.elseifladderoutput,R.drawable.elseifdemooutput};
     programoutput[4]=new int[]{R.drawable.fibonaccioutput,R.drawable.forexampleoutput,R.drawable.foreachexampleoutput,R.drawable.palindromeoutput,R.drawable.primenumberoutput,R.drawable.reversenumberoutput,R.drawable.strongnumberoutput,R.drawable.whileexampleoutput,R.drawable.dowhileexampleoutput,R.drawable.countingdigitsoutput};
     programoutput[5]=new int[]{R.drawable.arrayfibonaccioutput,R.drawable.bubblesortoutput,R.drawable.jaggedarrayoutput,R.drawable.matrixadditionoutput,R.drawable.matrixadditionoutput,R.drawable.selectionsortoutput,R.drawable.twodarrayoutput,R.drawable.arrayexampleoutput,R.drawable.endingzerofiveoutput,R.drawable.multidimensionaloutput,R.drawable.repeatedelementremoveoutput};
     programoutput[6]=new int[]{R.drawable.methodtypefouroutput,R.drawable.methodtypethreeoutput,R.drawable.methodtypetwooutput,R.drawable.methodtypeoneoutput,R.drawable.methodoverloadingoutput,R.drawable.methodoverloadthreeoutput,R.drawable.methodoverloadtwooutput};
     programoutput[7]=new int[]{R.drawable.constructordemooutput,R.drawable.constructordemo2output,R.drawable.distanceoutput,R.drawable.passingobjectsoutput,R.drawable.constructoroverloadingoutput,R.drawable.thiskeywordoutput};
     programoutput[8]=new int[]{R.drawable.singleinheritanceoutput,R.drawable.singleinheritance2output,R.drawable.superinheritanceoutput,R.drawable.methodoverridingoutput,R.drawable.finalclass,R.drawable.finalvariableoutput,R.drawable.finalmethodoutput,R.drawable.constructorcalloutput};
     programoutput[9]=new int[]{R.drawable.demointeroutput,R.drawable.testinteroutput,R.drawable.interdemooutput,R.drawable.multipleinterdemoutput,R.drawable.intertest7output,R.drawable.applicationinteroutput,R.drawable.calculationinteroutput,R.drawable.intertwooutput};
     programoutput[10]=new int[]{R.drawable.arithmeticexceptionoutput,R.drawable.trycatchdemooutput,R.drawable.chainedexceptionoutput,R.drawable.invalidageexceptionoutput,R.drawable.finallyoutput,R.drawable.finalvariableoutput,R.drawable.finalmethodoutput,R.drawable.constructorcalloutput};
     programoutput[11]=new int[]{R.drawable.creatingthreadoutput,R.drawable.currentthreadoutput,R.drawable.setpriority2,R.drawable.setpriority1,R.drawable.unsynchronizedthreadoutput,R.drawable.sleepmethodoutput,R.drawable.threadpriorityoutput,R.drawable.runnabledemooutput,R.drawable.multithreadoutput};
     programoutput[12]=new int[]{R.drawable.wrapperdemooutput,R.drawable.wrapperdemo2output,R.drawable.wrapperdemo3output,R.drawable.wrapperdemo4output,R.drawable.wrapperdemo5output,R.drawable.wrapperdemo6output};
     programoutput[13]=new int[]{R.drawable.mpowoutput,R.drawable.msqrtoutput,R.drawable.mceiloutput,R.drawable.mflooroutput,R.drawable.mrandomoutput};
     programoutput[14]=new int[]{R.drawable.stringconstrutoroutput,R.drawable.stringconcatoutput,R.drawable.charatexampleoutput,R.drawable.lengthexampleoutput};
     programoutput[15]=new int[]{R.drawable.jframecomponentoutput,R.drawable.jbuttoncomponentoutput,R.drawable.jlabelcomponentoutput,R.drawable.jtextfieldcomponentoutput,R.drawable.jpasswordfieldcomponentoutput,R.drawable.jcheckboxcomponentoutput,R.drawable.jlistcomponentoutput,R.drawable.jcomboboxcomponentoutput};
     programoutput[16]=new int[]{R.drawable.selectoutput,R.drawable.insertoutput,R.drawable.deleteoutput,R.drawable.updateoutput,R.drawable.preparedstatementoutput};
     programoutput[17]=new int[]{R.drawable.filedemo,R.drawable.filereaderclassoutput,R.drawable.filewriterclassoutput,R.drawable.fileinputstreamclassoutput,R.drawable.fileoutputstreamclassoutput,R.drawable.bufferedreaderforinputoutput,R.drawable.bufferedinputstreamoutput,R.drawable.bufferedoutputstreamoutput,R.drawable.objectserializationoutput,R.drawable.objectdeserializationoutput};
     programoutput[18]=new int[]{R.drawable.generictestoneoutput,R.drawable.generictesttwooutput,R.drawable.generictestfouroutput,R.drawable.generictestfiveoutput,R.drawable.generictestsevenoutput,R.drawable.generictesttenoutput,R.drawable.generictestelevenoutput,R.drawable.generictesttwelveoutput,R.drawable.generictestfifteenoutput,R.drawable.genericfifteeneoutput,R.drawable.generictestfifteenfoutput,R.drawable.genericfifteenjoutput};
     programoutput[19]=new int[]{R.drawable.vectorclasswithiteratoroutput,R.drawable.stackclassoutput,R.drawable.vectorclasswithenumerationoutput,R.drawable.arraylistclassoutput,R.drawable.arraylistclasswithlistiteratoroutput,R.drawable.linkedlistclassoutput,R.drawable.linkedlistwithlistiteratoroutput,R.drawable.treesetclassoutput,R.drawable.hashmapclassoutput,R.drawable.hashsetclassoutput,R.drawable.treemapclassoutput};
     programoutput[20]=new int[]{};//REFLECTION
     programoutput[21]=new int[]{R.drawable.simplenestedclassoutput,R.drawable.accessibilityinnestedclassoutput,R.drawable.creatinginnerclassobjectoutput,R.drawable.creatinginnerclassobjectoutput,R.drawable.innerclasswithinlooporifelseoutput,R.drawable.factorymethodtocreateobjectoutput};
     programoutput[22]=new int[]{R.drawable.storeswingoutput,R.drawable.retrieveswingoutput,R.drawable.updateswingoutput,R.drawable.deletionswingoutput};
 }
}
