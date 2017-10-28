package com.atech.trial1;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class SruthiWaste
{
	int choice;
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		SruthiWaste ex = new SruthiWaste();
		ex.getData("E:\\Supritha\\Dream, Determined\\XMLParsing\\Employees.xml");		
	}

	public void getData(String filename)
	 {
		try
		{			
			ArrayList<Xml1> list1 = new ArrayList<Xml1>();
			File fileName = new File(filename);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fileName);
			// http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			// doc.getDocumentElement().normalize();
			System.out.println("Root element : " + doc.getDocumentElement().getNodeName() + "\n");
			NodeList nList = doc.getElementsByTagName("Employee");
			for (int temp = 0; temp < nList.getLength(); temp++)
			{
				// Same as assigning to a Node and getting its NodeName
				Node nNode = nList.item(temp);
				//System.out.println("\nCurrent Element :" + nNode.getNodeName() + "\n");
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element elementobj = (Element) nNode;
					Xml1 element1 = new Xml1(elementobj.getElementsByTagName("name").item(0).getTextContent(), Integer.parseInt(elementobj.getElementsByTagName("age").item(0).getTextContent()),elementobj.getElementsByTagName("branch").item(0).getTextContent());
					//System.out.println("The collection first element data is : " +element1);
					list1.add(element1);	
				}
				
			}
			System.out.println("List before sorting : \n");
			Iterator<Xml1> itr = list1.iterator();
			while (itr.hasNext()) 
			{
				Xml1 newXmlObj = (Xml1) itr.next();
				System.out.println(newXmlObj);
				
			}
			System.out.println("You can sort the list by :\n1.Name\n2.Age\n3.Branch ");
			System.out.println("Please enter your choice : ");
			choice = scan.nextInt();
			switch(choice)
			{
				case 1:
					Collections.sort(list1);
					System.out.println("Printing through an iterator : ");
					Iterator<Xml1> itr2 = list1.iterator();
					while (itr2.hasNext()) 
					{
						Xml1 newXmlObj = (Xml1) itr2.next();
						System.out.println(newXmlObj);
						
					}
					break;
					
				case 2:					
					Collections.sort(list1, new Xml1());	
					System.out.println("List after sorting by Age : \n");
					Iterator<Xml1> itr3 = list1.iterator();
					while (itr3.hasNext()) 
					{
						Xml1 newXmlObj = (Xml1) itr3.next();
						System.out.println(newXmlObj);
						
					}
					break;
					
				case 3:
					/**
					Collections.sort(list1);
					System.out.println("Printing through an iterator : ");
					Iterator<Xml1> itr4 = list1.iterator();
					while (itr4.hasNext()) 
					{
						Xml1 newXmlObj = (Xml1) itr4.next();
						System.out.println(newXmlObj);
						
					}					
					break;
					**/
					
				default :
						System.out.println("Please enter a valid option.");
						break;
			}
			
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Xml1 implements Comparator<Xml1>, Comparable<Xml1>
{
	String name;
	int age;
	String branch;
	Xml1()
	{
		
	}

	Xml1(String name, int age, String branch) {
		this.name = name;
		this.age = age;
		this.branch = branch;
	}

	public String setName() {
		return name;
	}

	public int setAge() {
		return age;
	}

	public String setBranch() {
		return branch;
	}

	@Override
	public String toString() {
		return new String("Name : " + name + "\n" + "Age : " + age + "\n" + "Branch : " + branch + "\n");
	}

	public int compare(Xml1 x1, Xml1 x2) {
		return x2.age - x1.age;
	}
	
	public int compareTo(Xml1 x2) {
		return this.name.compareTo(x2.name);
	}	
	
}