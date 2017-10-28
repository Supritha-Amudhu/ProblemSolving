package com.atech.trial1;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParsing
{
	public void getData(String filename)
	{
		try
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			File file = new File(filename);
			if(file.exists())
			{
				Document doc = db.parse(file);
				//Trial
				System.out.println("doc.getChildNodes() : " +doc.getFirstChild());
				Element docEle = doc.getDocumentElement();
				//Root element gets printed.
				System.out.println("Root element is : " +docEle.getNodeName());
				NodeList nl = docEle.getChildNodes();//Employee
				for(int i =0; i<nl.getLength(); i++)
				{
					Node N1 = nl.item(i);
					if (N1 instanceof Element)
					{
						//Prints Employee
						System.out.println("Node's getNodeName : " +N1.getNodeName());
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
								System.out.println("Child List value is : " +nl1.item(j).getChildNodes().item(0).getNodeValue());
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
		XMLParsing ex = new XMLParsing();
		ex.getData("E:\\Supritha\\Dream, Determined\\XMLParsing\\Employees.xml");

	}

}
