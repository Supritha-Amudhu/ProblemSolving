package com.atech.trial1;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.util.*;

public class XmlWithCollections
{
	
	public void getData(String filename)
	{
		ArrayList<Xml> list1 = new ArrayList<Xml>();
		
		try
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			File file = new File(filename);
			if(file.exists())
			{
				Document doc = db.parse(file);
				System.out.println("doc.getChildNodes() : " +doc.getFirstChild());
				Element docEle = doc.getDocumentElement();
				//Root element gets printed.
				System.out.println("Root element is : " +docEle.getNodeName());
				NodeList nl = docEle.getChildNodes();//Employees				
				for(int i =0; i<nl.getLength(); i++)
				{
					Node N1 = nl.item(i);
					if (N1 instanceof Element)
					{
						//Prints Employee
						System.out.println(N1.getNodeName());
						Element ele = (Element) N1;
						//Creating nodelist for each Employee
						NodeList nl1 = ele.getChildNodes();
						for(int j=0;j<nl1.getLength();j++)
						{
							//Accessing each node in the Nodelist. Assigning the node elements from the NodeList into the Node
							Node N2 = nl1.item(j);
							//If the Node obtained is an Element Node -
							if(N2.getNodeType() == Node.ELEMENT_NODE)
							{
								//- print the Node's name as the Final Element Node (Ex : Name, Age, Branch, Technology)
								System.out.println("Child node is : " +N2.getNodeName());
								//Print the node's value : Harry, Supritha, etc.
								//System.out.println("Child List value is : " +nl1.item(j).getChildNodes().item(0).getNodeValue());
								Xml element = new Xml(nl1.item(j).getChildNodes().item(0).getNodeValue() ,Integer.parseInt(nl1.item(j).getChildNodes().item(1).getNodeValue()), nl1.item(j).getChildNodes().item(2).getNodeValue());
								System.out.println("Element name : " +element.name);
								list1.add(element);
								System.out.println("The ArrayList printed is : \n" +element);
								//Xml sample = new Xml("Sup", 45, "CSE");
								//list1.add(sample);
								//System.out.println("Elements of the list before sorting : " +list1.size());											
							}
						}
						
					}
						
				}
				
			}
			
			
		}
		
		catch(Exception ex)
		{
			System.out.println("The exception caught is : " +ex);
		}
		
	}

	
	public static void main(String[] args)
	{
		XmlWithCollections ex = new XmlWithCollections();
		ex.getData("E:\\Supritha\\Dream, Determined\\XMLParsing\\Employees.xml");
		

	}

}

class Xml
{
	String name;
	int age;
	String branch;
	Xml(String name, int age, String branch)
	{
		this.name = name;
		this.age = age;
		this.branch = branch;
		
	}
	public String setName()
	{
		return name;
	}
	public int setAge()
	{
		return age;
	}
	public String setBranch()
	{
		return branch;
	}
	@Override
	public String toString()
	{
		return new String("Name : " +name + " Age : " +age + " Branch : " +branch);
	}
	public int compare(Xml x1, Xml x2)
	{
		return (x2.age - x1.age);
	}
}