package Module08;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class EmpInfoSAXCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			DefaultHandler handler = new DefaultHandler() {

			boolean bname = false;
			boolean bgender = false;
			boolean bsalary = false;
			boolean baddress = false;
			

			public void startElement(String uri, String localName,String qName, Attributes attributes) throws SAXException {
				
				int length = attributes.getLength();
				
				System.out.println("Start Element: " + qName);
				
				for(int i=0;i<length;i++) {
					String id = attributes.getValue(i);
					System.out.println("Id: "+id);
				}
					if (qName.equalsIgnoreCase("NAME")) {
						bname = true;
					}
	
					if (qName.equalsIgnoreCase("GENDER")) {
						bgender = true;
					}
	
					if (qName.equalsIgnoreCase("SALARY")) {
						bsalary = true;
					}
	
					if (qName.equalsIgnoreCase("ADDRESS")) {
						baddress = true;
					}
				
			}
			
			public void characters(char ch[], int start, int length) throws SAXException {

				if (bname) {
					System.out.println("Name: " + new String(ch, start, length));
					bname = false;
				}

				if (bgender) {
					System.out.println("Gender: " + new String(ch, start, length));
					bgender = false;
				}

				if (bsalary) {
					System.out.println("Salary: " + new String(ch, start, length));
					bsalary = false;
				}

				if (baddress) {
					System.out.println("Address: " + new String(ch, start, length));
					baddress = false;
				}

			}

			public void endElement(String uri, String localName,
				String qName) throws SAXException {

				System.out.println("End Element: " + qName);

			}

		    };

		    saxParser.parse("C:\\Users\\Admin\\eclipse-workspace\\HelloWorld\\src\\Module08\\EmpInfoCS.xml", handler);
		 
	    }
		catch (Exception e) {
	       e.printStackTrace();
	     }
	}

}
