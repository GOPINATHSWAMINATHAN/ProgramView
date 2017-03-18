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
            "Methods or Functions.", "Classes and Objects.", "Inheritance.", "Packages.", "Interfaces.",
            "Exception Handling.", "Multi-Threading.", "Wrapper Classes.", "Math Lib. Functions.",
            "String and StringBuffer.", "Applets.", "Graphics.", "Event Handling.", "Abstract Window Toolkit.",
            "Swing.", "Java Database Connectivity.", "Input/Output Streams.",
            "Network Programming.", "Generics.", "Collection Classes.", "Reflection.", "Nested Class.", "Java Beans."};


    static{
        programDescription[0]=new String[]{"Program to display Hello World","Program to Calculate Compound Interest","Program to find Area of Circle","Swapping of Two Numbers"};
        programDescription[1]=new String[]{"Program to declare the Variables","Program to explain the initialization of variable","Program to declare the variables with different data types","Program to explain the lifetime of a variable","Program to declare the constant variables"};
        programDescription[2]=new String[]{"Program to explain the working of Arithmetic Operators","Program to explain Automatic Type Conversion","Program to explain the concept of Pre-fixed and Post-fixed Increment Operator","Program to explain the logical Bitwise Operator","Program to explain the Relational Operator","Program to explain the TypeConversion|Explicit TypeCasting"};
        programDescription[3]=new String[]{"Program to explain the if-else statement","Program to explain if statement","Program to find the Leap Year","Program to explain the nested-if statement","Program to find the number is Odd/Even","Program to explain the switch statement","Program to understand the switch statement","Program to explain the nested else-if statement"};
        programDescription[4]=new String[]{"Program to find the fibonacci series","Program to explain the for loop","Program to explain for-each loop","Program to find the palindrome","Program to find the Prime Number","Program to find the reverse of a number","Program to find the Strong Number","Program to explain the while loop","Program to explain the do-while loop","Counting the digits of a given number using looping statement"};
        programDescription[5]=new String[]{"Program to display fibonacci series using array","Program to explain Bubble Sort","Program to explain Jagged Array","Program to explain Matrix Addition","Program to explain Selection Sort","Program to explain Two Dimensional Array","Program to explain an array with Scanner class"};
        programDescription[6]=new String[]{"Method without return type and without parameters","Method without return type and with parameters","Method with return type and without parameters","Method with return type and with parameters","Program to explain the Final Variable","Program to explain the Final Method","Program to explain the Constructor"};
        programDescription[7]=new String[]{"Program to explain the Constructor","Program to describe the Constructor","Program to explain the class and objects with Distance class","Program to explain passing object to Method","Program to explain the Constructor Overloading","Program to explain the this keyword","Program to describe the this keyword"};
        programDescription[8]=new String[]{"Program to explain the Single Inheritance","Program to describe the Single Inheritance with ContainerWeight class","Program to explain the Multilevel inheritance","Program to explain the Method Overriding","Program to explain about the final class","Program to explain about the final method","Program to explain the super keyword","Program to explain the Hierarchical Inheritance"};
        programDescription[9]=new String[]{"Program to use simple interface","Program to use field in interface","Program to explain partial implementation of an interface","Program to explain Inheritance of a interface from another interface","Program to explain Inheritance of a interface from multiple interface","Program to explain Dynamic method dispatch(dynamic binding) with interface","Program to implement a class from multiple interfaces"};
        programDescription[10]=new String[]{"Program to explain the ArithmeticException","Program to explain try-catch block","Program to explain ChainedException","Program to explain Invalid-age Exception","Program to explain the final keyword","Program to explain Multiple catch block","Program to explain Multiple Exception","Program to explain Nested try-catch block","Program to explain throw keyword","Program to explain multiple catch"};
        programDescription[11]=new String[]{"Program to explain creating a thread","Program to explain the currentThread() Method","Program to explain getName() & getPriority() method","Program to explain setPriority() Method","Program to explain setPriority() with Counter class","Program to explain unsynchronized thread","Program to explain sleep() method","Program to explain the thread priority","Program to explain creating thread using Runnable interface","Program to explain creating multiple thread"};
        programDescription[12]=new String[]{"Program to use Simple Wrapper Class","Program to explain Auto-Boxing and Auto-Unboxing","Program to explain Wrapper class with function","Program to explain Wrapper class Boolean and Character","Program to use expression with Wrapper classes","Program to use Wrapper class with switch statement"};
        programDescription[13]=new String[]{"Program to explain the pow() method from Math Lib. Functions","Program to explain the sqrt() method from Math Lib. Functions","Program to explain the ceil() method from Math Lib. Functions","Program to explain the floor() method from Math Lib. Functions","Program to explain the random() method from Math Lib. Functions"};
        programDescription[14]=new String[]{"Program to explain String(char chars[],int startIndex,int numChars) constructor","Program to explain the String Constructor","Program to explain charAt() Method in String class","Program to explain the length() method","Program to explain equals() & equalsIgnoreCase() method","Program to explain getChars() method","Program to explain regionMatches() method","Program to explain split() method","Program to explain toLowerCase() method","Program to explain toUpperCase() method","Program to explain trim() method","Program to explain value() method","Program to explain the index() method","Program to explain String Buffer Constructor","Program to explain append() method","Program to explain capacity() method"};
        programDescription[15]=new String[]{};
        programDescription[16]=new String[]{};
        programDescription[17]=new String[]{};
        programDescription[18]=new String[]{};
        programDescription[19]=new String[]{};
        programDescription[20]=new String[]{};
        programDescription[21]=new String[]{};
        programDescription[22]=new String[]{};
        programDescription[23]=new String[]{};
        programDescription[24]=new String[]{};
        programDescription[25]=new String[]{};
        programDescription[26]=new String[]{};
    }
    static {
        programs[0]=new String[]{"Hello World","Compound Interest","Area Of Circle","Swapping Program"};
        programs[1]=new String[]{"Variable Declaration","Initializing Variables","DataTypeDemo","DataTypes","Variables LifeTime","Constant Variables"};
        programs[2]=new String[]{"Arithmetic Operator","Auto Conversion","Increment Operator","Logical Bitwise","Modulus Operator","Relational Operator","Explicit TypeCast"};
        programs[3]=new String[]{"IfElse","IfStatement","LeapYear","NestedIF","Odd-Even","Switch Statement","Switch Demo","Else-If Ladder"};
        programs[4]=new String[]{"Fibonacci","For-Loop","For-Each","Palindrome","Prime Number","Reverse Number","Strong Number","While Loop","Do-while loop","CountingDigits"};
        programs[5]=new String[]{"Array Fibonacci","Bubble Sort","Jagged Array","Matrix Addition","Selection Sort","Two-D Array","Array with Scanner"};
        programs[6]=new String[]{"Without ReturnType and without parameters","Without ReturnType and with parameters","With ReturnType and without parameters","With ReturnType and with Return Type","Final Variable","Final Method","Constructor"};
        programs[7]=new String[]{"Constructor","ConstructorDemo","Distance","PassingObject","ConstructorOverloading","This Keyword","This KeywordDemo"};
        programs[8]=new String[]{"Single Inheritance","Single Inh with ContainerWeightClass","MultiLevel Inheritance","Method Overriding","Final Class","Final Method","super keyword","Hierarchical Inheritance"};
        programs[9]=new String[]{"Simple Interface","Interface with Field","Partial Implementation of Interface","Inheriting Interface from Interface","Inheriting Interface from Multiple Interface","Dynamic Method dispatch with Interface","Implementing a class from Multiple Interface"};
        programs[10]=new String[]{"Arithmetic Exception","Try-Catch Demo","Chained Exception","Invalid Age Exception","Final Keyword","Multiple Catch","Multiple Exception","Nested Try-catch","Throw Keyword","Multiple Catch"};
        programs[11]=new String[]{"Creating Thread","currentThread() Method","Using getName() & getPriority().","setPriority()","setPriority() with Counter class","unsynchronized Thread","sleep() Method","Thread Priority","Creating Thread using Runnable","MultiThread"};
        programs[12]=new String[]{"Wrapper classes","Auto-boxing and auto-unboxing","Wrapper class in Function","Boolean and Character Wrappers","Expression with Wrapper class","Wrapper with switch"};
        programs[13]=new String[]{"pow() method","sqrt() method","ceil() method","floor() method","random() method"};
        programs[14]=new String[]{"String Constructor","String Concatenation","charAt() Method","length() method","equals() & equalsIgnoreCase Method","equalsIgnoreCase Method","getChars() method","regionMatches() method","split() method","toLowerCase() Method","toUpperCase() Method","trim() method","value() method","indexOf() Method","StringBuffer Constructor","append() method","capacity() method"};
        programs[15]=new String[]{};
        programs[16]=new String[]{};
        programs[17]=new String[]{};
        programs[18]=new String[]{};
        programs[19]=new String[]{"JFrame Component","JButton Component","JLabel Component","JTextField Component","JPasswordFieldComponent","JCheckBox Component","JList Component","JComboBox Component"};
        programs[20]=new String[]{"Select Query","Insert Query","Update Query","Delete Query","Prepared Statement"};
        programs[21]=new String[]{"Working With File","FileReader","FileWriter","FileInputStream","FileOutputStream","BufferedReader","BufferedInputStream","BufferedOutputStream","Serialization","De-Serialization"};
       // programs[22]=new String[]{-----------------};
        programs[23]=new String[]{};
        programs[24]=new String[]{"Vector class with Iterator","Stack class","Vector class with Enumeration","ArrayList class","ArrayList class with ListIterator","LinkedList class","LinkedList class with ListIterator","TreeSet class","HashMap class","HashSet class","TreeMap class"};
        programs[25]=new String[]{};
        programs[26]=new String[]{"Simple Nested class","Accessibility in Nested class","Creating Inner class Object","Inner class within loop or if-else","Factory method to create Object"};
    }

    static {

        sourceprograms[0]=new String[]{"HelloWorld.java","CompoundInterest.java","AreaOfCircle.java","Swap.java"};
        sourceprograms[1]=new String[]{"VariableDeclare.java","VariableInitialization.java","DataTypeDemo.java","DataTypes.java","VariableLifeTime.java","ConstantVariables.java"};
        sourceprograms[2]=new String[]{"ArithmeticOperators.java","AutomaticConversion.java","IncrementOperator.java","LogicalBitwise.java","ModulusOperator.java","RelationalOperator","TypeCastExplicit.java"};
        sourceprograms[3]=new String[]{"IfElse.java","IfStatement.java","LeapYear.java","NestedIf.java","OddEven.java","SwitchStatement.java","SwitchDemo.java","ElseIfLadder.java"};
        sourceprograms[4]=new String[]{"FibonacciExample.java","ForExample.java","ForEachExample.java","Palindrome.java","PrimeNumber.java","ReverseNumber.java","StrongNumber.java","WhileExample.java","DoWhileExample.java","CountingDigits.java"};
        sourceprograms[5]=new String[]{"ArrayFibonacci.java","BubbleSort.java","JaggedArray.java","MatrixAddition.java","SelectionSort.java","TwoDArray.java","ArrayExampleTwo.java"};
        sourceprograms[6]=new String[]{"MethodTypeFour.java","MethodTypeThree.java","MethodTypeTwo.java","MethodTypeOne.java","MethodOverloading.java","MethodOverloadThree.java","METHODOVERLOAD TWO.java"};
        sourceprograms[7]=new String[]{"ConstructorDemo.java","ConstructorDemo2.java","Distance.java","PassingObjects.java","ConstructorOverloading.java","ThisKeyword.java","ThisKeywordDemo.java"};
        sourceprograms[8]=new String[]{"SingleInheritance.java","SingleInheritance2.java","SuperInheritance.java","MethodOverriding.java","FinalClass.java","FinalVariable","FinalMethod.java","ConstructorCall.java"};
        sourceprograms[9]=new String[]{};//Inheritance
        sourceprograms[10]=new String[]{"ArithmeticException.java","TryCatchDemo.java","ChainedException.java","InvalidAgeException.java","Finally.java","MultipleExceptionDemo.java","NestedTryCatchBlock.java","ThrowDemo.java","MultipleCatchDemo.java"};
        sourceprograms[11]=new String[]{"CreatingThread.java","CurrentThread.java","","SetPriority2.java","SetPriority1.java","UnsynchronizedThread.java","SleepMethodDemo.java","ThreadPriority.java","RunnableDemo.java","MultiThread.java"};
        sourceprograms[12]=new String[]{"WrapperDemo.java","WrapperDemo2.java","WrapperDemo3.java","WrapperDemo4.java","WrapperDemo5.java","WrapperDemo6.java"};
        sourceprograms[13]=new String[]{"Mpow.java","Msqrt.java","Mceil.java","Mfloor.java","Mrandom.java"};
        sourceprograms[14]=new String[]{"StringConstructor.java","StringConcat.java","CharAtExample.java","LengthExample.java","equalsIgnoreExample.java","EqualsIgnoreCaseExample.java","GetCharMethodExample.java","RegionMatchesMethod.java","SplitMethodExample.java","ToLowerCaseExample.java","ToUpperCaseExample.java","TrimMethod.java","ValueOfMethod.java","IndexOfMethod.java","StringBufferConstructor.java","AppendMethod.java","CapacityMethod.java"};
        sourceprograms[15]=new String[]{};
        sourceprograms[16]=new String[]{};
        sourceprograms[17]=new String[]{};
        sourceprograms[18]=new String[]{};
        sourceprograms[19]=new String[]{"JFrameTest.java","JButtonTest1.java","JLabelTest1.java","JTextFieldTest1.java","JPasswordFieldtest1.java","JCheckBoxTest1.java","JListTest1.java","JComboBoxTest1.java"};
        sourceprograms[20]=new String[]{"JdbcSelect.java","JdbcInsert.java","JdbcDelete.java","JdbcUpdate.java","JdbcPreparedStatement.java"};
        sourceprograms[21]=new String[]{"FileDemo.java","FileReaderDemo.java","FileWriterDemo.java","FileInputStreamDemo.java","FileOutputStreamDemo.java","BufferedReaderForInput.java","BufferedInputStreamDemo.java","BufferedOutputStreamDemo.java","BoxSerialization.java","BoxDeSerialization.java"};
        //sourceprograms[22]=new String[]{};
        sourceprograms[23]=new String[]{};
        sourceprograms[24]=new String[]{"VectorText.java","StackTest.java","VectorTest5.java","ArrayList1.java","ArrayListClass.java","LinkedListTest1.java","LinkedListTest3.java","SetText1.java","MapTest2.java","TreeMap2.java"};
        sourceprograms[25]=new String[]{};
        sourceprograms[26]=new String[]{"NestedClassOne.java","Outer.java","NestedClassThree.java","NestedClassFour.java","NestedClassFour.java","NestedClassTwenty.java","NestedClassNine.java"};


    }

 static
 {
     programoutput[0]=new int[]{R.drawable.areaofcircleoutput,R.drawable.compoundinterestoutput,R.drawable.helloworldoutput,R.drawable.swapoutput};
     programoutput[1]=new int[]{R.drawable.variabledeclarationoutput,R.drawable.initializingvariableoutput,R.drawable.datatypedemooutput,R.drawable.datatypesoutput,R.drawable.variablelifetimeoutput,R.drawable.constantvariablesoutput};
     programoutput[2]=new int[]{R.drawable.incrementoperatoroutput,R.drawable.leapyearoutput,R.drawable.logicalbitwiseoutput,R.drawable.modulusoperatoroutput,R.drawable.nestedifoutput,R.drawable.relationaloperatoroutput};
     programoutput[3]=new int[]{R.drawable.ifstatementoutput,R.drawable.ifelseoutput,R.drawable.leapyearoutput,R.drawable.nestedifoutput,R.drawable.oddevenoutput,R.drawable.switchstatementoutput,R.drawable.switchdemooutput};
     programoutput[4]=new int[]{R.drawable.fibonaccioutput,R.drawable.forexampleoutput,R.drawable.foreachexampleoutput,R.drawable.palindromeoutput,R.drawable.primenumberoutput,R.drawable.reversenumberoutput,R.drawable.strongnumberoutput,R.drawable.whileexampleoutput,R.drawable.dowhileexampleoutput};
     programoutput[5]=new int[]{R.drawable.arrayfibonaccioutput,R.drawable.bubblesortoutput,R.drawable.jaggedarrayoutput,R.drawable.matrixadditionoutput,R.drawable.matrixadditionoutput,R.drawable.selectionsortoutput,R.drawable.twodarrayoutput};
     programoutput[6]=new int[]{R.drawable.methodtypefouroutput,R.drawable.methodtypethreeoutput,R.drawable.methodtypetwooutput,R.drawable.methodtypeoneoutput,};
     programoutput[7]=new int[]{R.drawable.constructordemooutput,R.drawable.constructordemo2output,R.drawable.distanceoutput,R.drawable.passingobjectsoutput,R.drawable.constructoroverloadingoutput,R.drawable.thiskeywordoutput};
     programoutput[8]=new int[]{R.drawable.singleinheritanceoutput,R.drawable.singleinheritance2output,R.drawable.superinheritanceoutput,R.drawable.methodoverridingoutput,R.drawable.finalclass,R.drawable.finalvariableoutput,R.drawable.finalmethodoutput,R.drawable.constructorcalloutput};
     programoutput[9]=new int[]{};
     programoutput[10]=new int[]{R.drawable.arithmeticexceptionoutput,R.drawable.trycatchdemooutput,R.drawable.chainedexceptionoutput,R.drawable.invalidageexceptionoutput,R.drawable.finallyoutput,R.drawable.finalvariableoutput,R.drawable.finalmethodoutput,R.drawable.constructorcalloutput};
     programoutput[11]=new int[]{R.drawable.creatingthreadoutput,R.drawable.currentthreadoutput,R.drawable.setpriority2,R.drawable.setpriority1,R.drawable.unsynchronizedthreadoutput,R.drawable.sleepmethodoutput,R.drawable.threadpriorityoutput,R.drawable.runnabledemooutput,R.drawable.multithreadoutput};
     programoutput[12]=new int[]{R.drawable.wrapperdemooutput,R.drawable.wrapperdemo2output,R.drawable.wrapperdemo3output,R.drawable.wrapperdemo4output,R.drawable.wrapperdemo5output,R.drawable.wrapperdemo6output};
//     programoutput[13]=new int[]{---------------------------------------};
     programoutput[14]=new int[]{R.drawable.stringconstrutoroutput,R.drawable.stringconcatoutput,R.drawable.charatexampleoutput,R.drawable.lengthexampleoutput};
     programoutput[15]=new int[]{};//Math Lib Functions
     programoutput[16]=new int[]{};//String and String Buffer
     programoutput[17]=new int[]{};//Applets
     programoutput[18]=new int[]{};//Graphics
     programoutput[19]=new int[]{R.drawable.jframecomponentoutput,R.drawable.jbuttoncomponentoutput,R.drawable.jlabelcomponentoutput,R.drawable.jtextfieldcomponentoutput,R.drawable.jpasswordfieldcomponentoutput,R.drawable.jcheckboxcomponentoutput,R.drawable.jlistcomponentoutput,R.drawable.jcomboboxcomponentoutput};
     programoutput[20]=new int[]{};
     programoutput[21]=new int[]{R.drawable.filedemo,R.drawable.filereaderclassoutput,R.drawable.filewriterclassoutput,R.drawable.fileinputstreamclassoutput,R.drawable.fileoutputstreamclassoutput,R.drawable.bufferedreaderforinputoutput,R.drawable.bufferedinputstreamoutput,R.drawable.bufferedoutputstreamoutput,R.drawable.objectserializationoutput,R.drawable.objectdeserializationoutput};
     programoutput[22]=new int[]{};
     programoutput[23]=new int[]{};
     programoutput[24]=new int[]{R.drawable.vectorclasswithiteratoroutput,R.drawable.stackclassoutput,R.drawable.vectorclasswithenumerationoutput,R.drawable.arraylistclassoutput,R.drawable.arraylistclasswithlistiteratoroutput,R.drawable.linkedlistclassoutput,R.drawable.linkedlistwithlistiteratoroutput,R.drawable.treesetclassoutput,R.drawable.hashmapclassoutput,R.drawable.hashsetclassoutput,R.drawable.treemapclassoutput};
     programoutput[25]=new int[]{R.drawable.simplenestedclassoutput,R.drawable.accessibilityinnestedclassoutput,R.drawable.creatinginnerclassobjectoutput,R.drawable.creatinginnerclassobjectoutput,R.drawable.innerclasswithinlooporifelseoutput,R.drawable.factorymethodtocreateobjectoutput};
 }
}


//    static
//    {
//        sourceprograms[0]= new int[]{R.drawable.aocone,R.drawable.cione,R.drawable.hwone,R.drawable.swapone};
//        sourceprograms[1]=new int[]{R.drawable.variabledeclaration,R.drawable.initializingvariable,R.drawable.datatypedemo,R.drawable.datatypes,R.drawable.variablelifetime,R.drawable.constantvariables};
//        sourceprograms[2]=new int[]{R.drawable.incrementoperator,R.drawable.leapyear,R.drawable.logicalbitwise,R.drawable.modulusoperator,R.drawable.nestedif,R.drawable.relationaloperator};
//        sourceprograms[3]=new int[]{R.drawable.ifstatement,R.drawable.ifelse,R.drawable.leapyear,R.drawable.nestedif,R.drawable.oddeven,R.drawable.switchstatement,R.drawable.switchdemo};
//        sourceprograms[4]=new int[]{R.drawable.fibonacci,R.drawable.forexample,R.drawable.foreachexample,R.drawable.palindrome,R.drawable.primenumber,R.drawable.ssnnone,R.drawable.strongnumberone,R.drawable.whileexample,R.drawable.dowhileexample};
//        sourceprograms[5]=new int[]{R.drawable.arrayfibonacci,R.drawable.bubblesort,R.drawable.jaggedarray,R.drawable.matrixaddition,R.drawable.selectionsort,R.drawable.twodarray};
//        sourceprograms[6]=new int[]{R.drawable.methodtypefour,R.drawable.methodtypethree,R.drawable.methodtypetwo,R.drawable.methodtypeone};
//        sourceprograms[7]=new int[]{R.drawable.constructordemo,R.drawable.constructordemo2,R.drawable.distance,R.drawable.passingobjects,R.drawable.constructoroverloading,R.drawable.thiskeyword,R.drawable.thiskeyworddemo};
//        sourceprograms[8]=new int[]{R.drawable.singleinheritance,R.drawable.singleinheritance2,R.drawable.superinheritance,R.drawable.methodoverriding,R.drawable.finalclass,R.drawable.finalmethod,R.drawable.superinheritance};
//        sourceprograms[9]=new int[]{R.drawable.arithmeticexception,R.drawable.trycatchdemo,R.drawable.chainedexception,R.drawable.invalidageexception,R.drawable.finallydemo,R.drawable.multipleexceptiondemo,R.drawable.nestedtrycatchbloc};
//        sourceprograms[10]=new int[]{R.drawable.creatingthread,R.drawable.currentthread,R.drawable.threadpriority,R.drawable.setpriority1,R.drawable.setpriority2,R.drawable.unsynchronizedthread,R.drawable.sleepmethoddemo,R.drawable.threadpriority,R.drawable.runnabledemo,R.drawable.multithread};
//        sourceprograms[11]=new int[]{R.drawable.wrapperdemo,R.drawable.wrapperdemo2,R.drawable.wrapperdemo3,R.drawable.wrapperdemo4,R.drawable.wrapperdemo5,R.drawable.wrapperdemo6};
//    }