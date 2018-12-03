package com.oocl.schema.cus.lookup;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

/**
 * CPFLookUpCriteriaV1必须被注解为@XmlRootElement
 */
public class JAXBTest {
    @Test
    public void testMarshalling() throws JAXBException {
        String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ns2:cpfLookUpCriteriaV1 xmlns=\"http://com.oocl.schema.customer.lookup\" xmlns:ns2=\"http://com.oocl.schema.common\" xmlns:ns3=\"http://com.oocl.schema.customer\" xmlns:ns4=\"http://com.oocl.schema.tnm\"><CustomerSearchCriteria><CustomerName>Sony</CustomerName><SAP_ID>987654321</SAP_ID><Customer_ID>987654321</Customer_ID><CargoSmart_ID>987654321</CargoSmart_ID></CustomerSearchCriteria><CustomerAlias>Sony test</CustomerAlias><Country><ns2:CountryInformation><ns2:Type>Country</ns2:Type><ns2:ID>123456</ns2:ID><ns2:UUID>123456789</ns2:UUID><ns2:Name><ns2:EnglishName>America</ns2:EnglishName><ns2:FullyQualifiedName>United States of America</ns2:FullyQualifiedName></ns2:Name><ns2:IsActive>true</ns2:IsActive></ns2:CountryInformation><ns2:Continent><ns2:Name>North America</ns2:Name></ns2:Continent><ns2:Currency>Dollar</ns2:Currency></Country><State>Maine</State><PostalCode>513000</PostalCode></ns2:cpfLookUpCriteriaV1>";
        JAXBContext context = JAXBContext.newInstance(CPFLookUpCriteriaV1.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        StringReader reader = new StringReader(xmlStr);
        CPFLookUpCriteriaV1 criteria = (CPFLookUpCriteriaV1) unmarshaller.unmarshal(reader);
        System.out.println(criteria);
    }

    @Test
    public void testUnmarshalling() throws JAXBException {
        ObjectFactory factory = new ObjectFactory();
        CountryV1 country = factory.createCountryV1();
        ContinentV1 continent = factory.createContinentV1();
        CPFLookUpCriteriaV1 cpfLookUpCriteria = factory.createCPFLookUpCriteriaV1();
        BasicLocationInformationV1 locationInformation = factory.createBasicLocationInformationV1();
        LocationNameV1 locationName = factory.createLocationNameV1();
        CustomerCriteriaV1 customerCriteria = factory.createCustomerCriteriaV1();
        cpfLookUpCriteria.setPostalCode("513000");
        cpfLookUpCriteria.setState("Maine");
        cpfLookUpCriteria.setCustomerAlias("Sony test");
        country.setCurrency("Dollar");
        continent.setName("North America");
        country.setContinent(continent);
        locationInformation.setID(123456L);
        locationInformation.setIsActive(true);
        locationInformation.setUUID("123456789");
        locationInformation.setType("Country");
        locationName.setEnglishName("America");
        locationName.setFullyQualifiedName("United States of America");
        locationInformation.setName(locationName);
        country.setCountryInformation(locationInformation);
        cpfLookUpCriteria.setCountry(country);
        customerCriteria.setCargoSmartID("987654321");
        customerCriteria.setCustomerID("987654321");
        customerCriteria.setCustomerName("Sony");
        customerCriteria.setSAPID("987654321");
        cpfLookUpCriteria.setCustomerSearchCriteria(customerCriteria);
        JAXBContext context = JAXBContext.newInstance(CPFLookUpCriteriaV1.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(cpfLookUpCriteria, System.out);
    }
}
