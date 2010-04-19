package org.osgiusers.germany.example.kasse.webtest;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.xml.sax.SAXException;

import com.meterware.httpunit.GetMethodWebRequest;
import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;


public class MainTest {

	@Test
	public void testMe() throws IOException, SAXException, InterruptedException {
		Thread.sleep(10000);
	    WebConversation wc = new WebConversation();
	    WebRequest     req = new GetMethodWebRequest( "http://localhost:8888/kasse/cashPoint.jsf" );
	    WebResponse   resp = wc.getResponse( req );
	    Assert.assertEquals("Basar Kasse",resp.getTitle());
	}
}
