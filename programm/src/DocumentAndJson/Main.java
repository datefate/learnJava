package DocumentAndJson;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author datefate
 * @site create 2021-03-16-下午4:33
 */
public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        InputStream input = Main.class.getResourceAsStream("/book.xml");

        //建立DocumentBuilderFactor，用于获得DocumentBuilder对象
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        //2.建立DocumentBuidler
        DocumentBuilder db = dbf.newDocumentBuilder();
        //3.建立Document对象，获取树的入口：
        Document doc = db.parse(input);//interface
        printNode(doc,0);
    }

    private static void printNode(Node doc, int indent) {
        for (int i= 0;i<indent;i++){
            System.out.println(' ');
        }
        switch (doc.getNodeType()){
            case Node.DOCUMENT_NODE:
                System.out.println("Document:"+doc.getNodeName());
                break;
            case Node.ELEMENT_NODE:
                System.out.println("Element :"+doc.getNodeName());
                break;
            case Node.TEXT_NODE:
                System.out.println("Text:"+doc.getNodeName()+
                        "=" +doc.getNodeValue());
                break;
            case Node.ATTRIBUTE_NODE:
                System.out.println("Attr:"+doc.getNodeName()+
                        "="+doc.getNodeValue());
                break;
            case Node.COMMENT_NODE:
                System.out.println("Comment:"+doc.getNodeValue()+
                        "= "+doc.getNodeValue());
                break;
            default:
                System.out.println("NodeType:"+doc.getNodeType()+
                        ",NodeName:"+doc.getNodeName());
        }
        for (Node child = doc.getFirstChild();child !=null;child=child.getNextSibling()){
            printNode(child,indent+1);
        }
    }
}
