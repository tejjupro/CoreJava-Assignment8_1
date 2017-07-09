package package1;    //This java file is inside package named package1 inside src folder.
import java.io.*;    //importing all classes from java's io library.. Because it has File related Classes needed for this Assignment.

/*
 * This Assignment helped me to master the concepts of File handling .
 */

public class Assignment8_1      //Class declaration containing main function.
{
	public static void main(String[] args) throws Exception  //main function declaration. and because it is static, program execution starts from main function. 
	{
		//In this program, we will first read from the file and we will write that content to another file.
		//We will create the object of FileInputStream and will pass the object of File containing file Path to its constructor.
		FileInputStream readSrcFile = new FileInputStream("C:/Users/Rupali/Desktop/CoreJavaAssignment8_1/srcFile.txt");
		
		//We will create the object of FileOutputStream and will pass the object of File containig filePath to its constructors.
		FileOutputStream writeSrcFile = new FileOutputStream("C:/Users/Rupali/Desktop/CoreJavaAssignment8_1/destnFile.txt");
		
		byte[] readerArray = new byte[1024];     //byte array to read from the file.
		int len;     //int variable to locate the length of File.
		
		//While loop to read the file till and write in the file.
		while((len=readSrcFile.read(readerArray))>0)
		{
			writeSrcFile.write(readerArray, 0, len);    //writing in the file from readerArray.
		}
		
		//Closing FileInputStream and FileOutputStream Objects.
		readSrcFile.close();
		writeSrcFile.close();
		
		System.out.println("A text file has been created.\n");    //Printing Statement.
		
		System.out.println("Content of The file is : \n");    //Printing Statement.
		
		//Now we are reading created file.
		//Creating the object of BufferedReader and passed the path of File by FileReader.
		BufferedReader readDestnFile = new BufferedReader(new FileReader("C:/Users/Rupali/Desktop/CoreJavaAssignment8_1/destnFile.txt"));
		String lineReader;             //String reference to read the line from the file.
		
		//While loop to read from the file and printing on the console.
		while((lineReader = readDestnFile.readLine()) != null)
		{
			System.out.println(lineReader);   //Printing the Statement.
		}
		
		//Closing BufferedReader object.
		readDestnFile.close();
		
	}     //End of main function.
}    //End of class.