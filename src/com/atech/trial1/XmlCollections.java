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

public class XmlCollections
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		XmlCollections ex = new XmlCollections();
		int choice=0, flag=0;
		while(flag==0)
		{
		System.out.println("You can sort the list by :\n1.Display the List\n2.Name\n3.Age\n4.Branch\n5.Exit ");
		System.out.println("Please enter your choice : ");
		choice = scan.nextInt();
		if(choice==5)
			break;
		ex.getData("E:\\Supritha\\Dream, Determined\\XMLParsing\\Employees.xml", choice);
		}		
				
	}

	public void getData(String filename, int choice)
	 {
		try
		{			
			ArrayList<XmlSample> list1 = new ArrayList<XmlSample>();
			File fileName = new File(filename);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fileName);
			//System.out.println("Root element : " + doc.getDocumentElement().getNodeName() + "\n");
			NodeList nodeList = doc.getElementsByTagName("Employee");
			for (int temp = 0; temp < nodeList.getLength(); temp++)
			{
				Node node = nodeList.item(temp);
				if (node.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element elementobj = (Element) node;
					XmlSample element1 = new XmlSample(elementobj.getElementsByTagName("name").item(0).getTextContent(), Integer.parseInt(elementobj.getElementsByTagName("age").item(0).getTextContent()),elementobj.getElementsByTagName("branch").item(0).getTextContent());
					list1.add(element1);	
					
				}				
			}
			
			switch(choice)
			{
			case 1:
			
				System.out.println("List before sorting : \n");
				Iterator<XmlSample> itr = list1.iterator();
				while (itr.hasNext()) 
				{
					XmlSample newXmlObj = (XmlSample) itr.next();
					System.out.println(newXmlObj);					
				}
				break;				
					
			case 2:
			
				Collections.sort(list1);
				System.out.println("List after sorting by Name : \n");
				Iterator<XmlSample> itr2 = list1.iterator();
				while (itr2.hasNext()) 
				{
					XmlSample newXmlObj = (XmlSample) itr2.next();
					System.out.println(newXmlObj);					
				}
				break;
					
			case 3:
			
				Collections.sort(list1, new XmlSample());	
				System.out.println("List after sorting by Age : \n");
				Iterator<XmlSample> itr3 = list1.iterator();
				while (itr3.hasNext()) 
				{
					XmlSample newXmlObj = (XmlSample) itr3.next();
					System.out.println(newXmlObj);					
				}
				break;
		
			case 4:
			
				
				break;
				
			case 5:
				
				break;
				
			default:
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

class XmlSample implements Comparator<XmlSample>, Comparable<XmlSample>
{
	String name;
	int age;
	String branch;
	XmlSample()
	{
		
	}

	XmlSample(String name, int age, String branch) {
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

	public int compare(XmlSample x1, XmlSample x2) {
		return x2.age - x1.age;
	}
	
	public int compareTo(XmlSample x2) {
		return this.name.compareTo(x2.name);
	}	
	
}