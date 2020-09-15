package Module08;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class EmpInfoCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			Element mainRootElement = doc.createElement("Employees");
			doc.appendChild(mainRootElement);
			
			mainRootElement.appendChild(getEmployee(doc, "1", "Josh", "Male", "50000", "Amsterdam"));
			mainRootElement.appendChild(getEmployee(doc, "2", "Miya", "Female", "80000", "Vienna"));
			mainRootElement.appendChild(getEmployee(doc, "3", "Light", "Male", "100000", "Berlin"));
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); 
            DOMSource source = new DOMSource(doc);
            File file = new File("C:\\Users\\Admin\\eclipse-workspace\\HelloWorld\\src\\Module08\\EmpInfoCS.xml");
            StreamResult console = new StreamResult(System.out);
            StreamResult fileOutput = new StreamResult(file);
            transformer.transform(source, console);
            transformer.transform(source, fileOutput);
 
            System.out.println("\nXML DOM Created Successfully!!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		private static Node getEmployee(Document doc, String id, String name, String gender, String salary, String address) {
	        Element employee = doc.createElement("Employee");
	        employee.setAttribute("id", id);
	        employee.appendChild(getEmployeeElements(doc, employee, "Name", name));
	        employee.appendChild(getEmployeeElements(doc, employee, "Gender", gender));
	        employee.appendChild(getEmployeeElements(doc, employee, "Salary", salary));
	        employee.appendChild(getEmployeeElements(doc, employee, "Address", address));
	        return employee;
	    }
	 
	    // utility method to create text node
	    private static Node getEmployeeElements(Document doc, Element element, String name, String value) {
	        Element node = doc.createElement(name);
	        node.appendChild(doc.createTextNode(value));
	        return node;
	    }
}
