package Module08;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class StudInfoDOMCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	         File inputFile = new File("C:\\Users\\Admin\\eclipse-workspace\\HelloWorld\\src\\Module08\\StudInfoCS.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root Element: " + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("Student");
	         System.out.println("----------------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element: " + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("Id: " + eElement.getAttribute("id"));
	               System.out.println("Name: " + eElement.getElementsByTagName("Name").item(0).getTextContent());
	               System.out.println("Standard: " + eElement.getElementsByTagName("Standard").item(0).getTextContent());
	               System.out.println("Gender: " + eElement.getElementsByTagName("Gender").item(0).getTextContent());
	               System.out.println("Marks: " + eElement.getElementsByTagName("Marks").item(0).getTextContent());
	               System.out.println("Address: " + eElement.getElementsByTagName("Address").item(0).getTextContent());
	            }
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	}

}
