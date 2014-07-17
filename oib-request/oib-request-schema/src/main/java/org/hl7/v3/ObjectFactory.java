//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.16 at 08:16:48 PM MDT 
//


package org.hl7.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.hl7.v3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PersonTypeEmail_QNAME = new QName("", "email");
    private final static QName _PersonTypeName_QNAME = new QName("", "name");
    private final static QName _PersonTypeUri_QNAME = new QName("", "uri");
    private final static QName _SourceTypeId_QNAME = new QName("", "id");
    private final static QName _SourceTypeIcon_QNAME = new QName("", "icon");
    private final static QName _SourceTypeLogo_QNAME = new QName("", "logo");
    private final static QName _SourceTypeAuthor_QNAME = new QName("", "author");
    private final static QName _SourceTypeTitle_QNAME = new QName("", "title");
    private final static QName _SourceTypeCategory_QNAME = new QName("", "category");
    private final static QName _SourceTypeUpdated_QNAME = new QName("", "updated");
    private final static QName _SourceTypeContributor_QNAME = new QName("", "contributor");
    private final static QName _SourceTypeLink_QNAME = new QName("", "link");
    private final static QName _SourceTypeRights_QNAME = new QName("", "rights");
    private final static QName _SourceTypeSubtitle_QNAME = new QName("", "subtitle");
    private final static QName _SourceTypeGenerator_QNAME = new QName("", "generator");
    private final static QName _REDSMT010001UVKnowledgeRequestNotification_QNAME = new QName("", "REDS_MT010001UV.knowledgeRequestNotification");
    private final static QName _Entry_QNAME = new QName("", "entry");
    private final static QName _TaskContext_QNAME = new QName("", "taskContext");
    private final static QName _PatientContext_QNAME = new QName("", "patientContext");
    private final static QName _InformationRecipient_QNAME = new QName("", "informationRecipient");
    private final static QName _SubTopic_QNAME = new QName("", "subTopic");
    private final static QName _Performer_QNAME = new QName("", "performer");
    private final static QName _Feed_QNAME = new QName("", "feed");
    private final static QName _MainSearchCriteria_QNAME = new QName("", "mainSearchCriteria");
    private final static QName _Encounter_QNAME = new QName("", "encounter");
    private final static QName _AggregateKnowledgeResponse_QNAME = new QName("", "aggregateKnowledgeResponse");
    private final static QName _REDSMT010001UVPerformerPatient_QNAME = new QName("", "patient");
    private final static QName _REDSMT010001UVPerformerHealthCareProvider_QNAME = new QName("", "healthCareProvider");
    private final static QName _REDSMT010001UVEncounterServiceDeliveryLocation_QNAME = new QName("", "serviceDeliveryLocation");
    private final static QName _REDSMT010001UVKnowledgeRequestNotificationHolder_QNAME = new QName("", "holder");
    private final static QName _REDSMT010001UVMainSearchCriteriaSeverityObservation_QNAME = new QName("", "severityObservation");
    private final static QName _REDSMT010001UVHealthCareProviderHealthCarePerson_QNAME = new QName("", "healthCarePerson");
    private final static QName _REDSMT010001UVPatientPatientPerson_QNAME = new QName("", "patientPerson");
    private final static QName _REDSMT010001UVAssignedEntityAssignedAuthorizedPerson_QNAME = new QName("", "assignedAuthorizedPerson");
    private final static QName _REDSMT010001UVAssignedEntityRepresentedOrganization_QNAME = new QName("", "representedOrganization");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.hl7.v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link REDSMT010001UVAge }
     * 
     */
    public REDSMT010001UVAge createREDSMT010001UVAge() {
        return new REDSMT010001UVAge();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link ContentType }
     * 
     */
    public ContentType createContentType() {
        return new ContentType();
    }

    /**
     * Create an instance of {@link REDSMT010001UVServiceDeliveryLocation }
     * 
     */
    public REDSMT010001UVServiceDeliveryLocation createREDSMT010001UVServiceDeliveryLocation() {
        return new REDSMT010001UVServiceDeliveryLocation();
    }

    /**
     * Create an instance of {@link TSLite }
     * 
     */
    public TSLite createTSLite() {
        return new TSLite();
    }

    /**
     * Create an instance of {@link REDSMT010001UVPatientPerson }
     * 
     */
    public REDSMT010001UVPatientPerson createREDSMT010001UVPatientPerson() {
        return new REDSMT010001UVPatientPerson();
    }

    /**
     * Create an instance of {@link CDLite }
     * 
     */
    public CDLite createCDLite() {
        return new CDLite();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link PQValueUnit }
     * 
     */
    public PQValueUnit createPQValueUnit() {
        return new PQValueUnit();
    }

    /**
     * Create an instance of {@link REDSMT010001UVMainSearchCriteria }
     * 
     */
    public REDSMT010001UVMainSearchCriteria createREDSMT010001UVMainSearchCriteria() {
        return new REDSMT010001UVMainSearchCriteria();
    }

    /**
     * Create an instance of {@link REDSMT010001UVHealthCareProvider }
     * 
     */
    public REDSMT010001UVHealthCareProvider createREDSMT010001UVHealthCareProvider() {
        return new REDSMT010001UVHealthCareProvider();
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link IILite }
     * 
     */
    public IILite createIILite() {
        return new IILite();
    }

    /**
     * Create an instance of {@link REDSMT010001UVLanguageCommunication }
     * 
     */
    public REDSMT010001UVLanguageCommunication createREDSMT010001UVLanguageCommunication() {
        return new REDSMT010001UVLanguageCommunication();
    }

    /**
     * Create an instance of {@link EDLite }
     * 
     */
    public EDLite createEDLite() {
        return new EDLite();
    }

    /**
     * Create an instance of {@link REDSMT010001UVEncounter }
     * 
     */
    public REDSMT010001UVEncounter createREDSMT010001UVEncounter() {
        return new REDSMT010001UVEncounter();
    }

    /**
     * Create an instance of {@link REDSMT010001UVInformationRecipient }
     * 
     */
    public REDSMT010001UVInformationRecipient createREDSMT010001UVInformationRecipient() {
        return new REDSMT010001UVInformationRecipient();
    }

    /**
     * Create an instance of {@link REDSMT010001UVSubTopic }
     * 
     */
    public REDSMT010001UVSubTopic createREDSMT010001UVSubTopic() {
        return new REDSMT010001UVSubTopic();
    }

    /**
     * Create an instance of {@link REDSMT010001UVPerson }
     * 
     */
    public REDSMT010001UVPerson createREDSMT010001UVPerson() {
        return new REDSMT010001UVPerson();
    }

    /**
     * Create an instance of {@link REDSMT010001UVSeverityObservation }
     * 
     */
    public REDSMT010001UVSeverityObservation createREDSMT010001UVSeverityObservation() {
        return new REDSMT010001UVSeverityObservation();
    }

    /**
     * Create an instance of {@link AggregateKnowledgeResponse }
     * 
     */
    public AggregateKnowledgeResponse createAggregateKnowledgeResponse() {
        return new AggregateKnowledgeResponse();
    }

    /**
     * Create an instance of {@link GeneratorType }
     * 
     */
    public GeneratorType createGeneratorType() {
        return new GeneratorType();
    }

    /**
     * Create an instance of {@link REDSMT010001UVAgeGroup }
     * 
     */
    public REDSMT010001UVAgeGroup createREDSMT010001UVAgeGroup() {
        return new REDSMT010001UVAgeGroup();
    }

    /**
     * Create an instance of {@link REDSMT010001UVPerformer }
     * 
     */
    public REDSMT010001UVPerformer createREDSMT010001UVPerformer() {
        return new REDSMT010001UVPerformer();
    }

    /**
     * Create an instance of {@link IdType }
     * 
     */
    public IdType createIdType() {
        return new IdType();
    }

    /**
     * Create an instance of {@link REDSMT010001UVAuthorizedPerson }
     * 
     */
    public REDSMT010001UVAuthorizedPerson createREDSMT010001UVAuthorizedPerson() {
        return new REDSMT010001UVAuthorizedPerson();
    }

    /**
     * Create an instance of {@link EntryType }
     * 
     */
    public EntryType createEntryType() {
        return new EntryType();
    }

    /**
     * Create an instance of {@link REDSMT010001UVLocation }
     * 
     */
    public REDSMT010001UVLocation createREDSMT010001UVLocation() {
        return new REDSMT010001UVLocation();
    }

    /**
     * Create an instance of {@link REDSMT010001UVHolder }
     * 
     */
    public REDSMT010001UVHolder createREDSMT010001UVHolder() {
        return new REDSMT010001UVHolder();
    }

    /**
     * Create an instance of {@link REDSMT010001UVPatient }
     * 
     */
    public REDSMT010001UVPatient createREDSMT010001UVPatient() {
        return new REDSMT010001UVPatient();
    }

    /**
     * Create an instance of {@link REDSMT010001UVOrganization }
     * 
     */
    public REDSMT010001UVOrganization createREDSMT010001UVOrganization() {
        return new REDSMT010001UVOrganization();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link REDSMT010001UVTaskContext }
     * 
     */
    public REDSMT010001UVTaskContext createREDSMT010001UVTaskContext() {
        return new REDSMT010001UVTaskContext();
    }

    /**
     * Create an instance of {@link STLite }
     * 
     */
    public STLite createSTLite() {
        return new STLite();
    }

    /**
     * Create an instance of {@link FeedType }
     * 
     */
    public FeedType createFeedType() {
        return new FeedType();
    }

    /**
     * Create an instance of {@link REDSMT010001UVPatientContext }
     * 
     */
    public REDSMT010001UVPatientContext createREDSMT010001UVPatientContext() {
        return new REDSMT010001UVPatientContext();
    }

    /**
     * Create an instance of {@link UriType }
     * 
     */
    public UriType createUriType() {
        return new UriType();
    }

    /**
     * Create an instance of {@link LogoType }
     * 
     */
    public LogoType createLogoType() {
        return new LogoType();
    }

    /**
     * Create an instance of {@link IconType }
     * 
     */
    public IconType createIconType() {
        return new IconType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link REDSMT010001UVKnowledgeRequestNotification }
     * 
     */
    public REDSMT010001UVKnowledgeRequestNotification createREDSMT010001UVKnowledgeRequestNotification() {
        return new REDSMT010001UVKnowledgeRequestNotification();
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link REDSMT010001UVAssignedEntity }
     * 
     */
    public REDSMT010001UVAssignedEntity createREDSMT010001UVAssignedEntity() {
        return new REDSMT010001UVAssignedEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email", scope = PersonType.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPersonTypeEmail(String value) {
        return new JAXBElement<String>(_PersonTypeEmail_QNAME, String.class, PersonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = PersonType.class)
    public JAXBElement<String> createPersonTypeName(String value) {
        return new JAXBElement<String>(_PersonTypeName_QNAME, String.class, PersonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UriType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uri", scope = PersonType.class)
    public JAXBElement<UriType> createPersonTypeUri(UriType value) {
        return new JAXBElement<UriType>(_PersonTypeUri_QNAME, UriType.class, PersonType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "id", scope = SourceType.class)
    public JAXBElement<IdType> createSourceTypeId(IdType value) {
        return new JAXBElement<IdType>(_SourceTypeId_QNAME, IdType.class, SourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IconType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "icon", scope = SourceType.class)
    public JAXBElement<IconType> createSourceTypeIcon(IconType value) {
        return new JAXBElement<IconType>(_SourceTypeIcon_QNAME, IconType.class, SourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "logo", scope = SourceType.class)
    public JAXBElement<LogoType> createSourceTypeLogo(LogoType value) {
        return new JAXBElement<LogoType>(_SourceTypeLogo_QNAME, LogoType.class, SourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "author", scope = SourceType.class)
    public JAXBElement<PersonType> createSourceTypeAuthor(PersonType value) {
        return new JAXBElement<PersonType>(_SourceTypeAuthor_QNAME, PersonType.class, SourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "title", scope = SourceType.class)
    public JAXBElement<TextType> createSourceTypeTitle(TextType value) {
        return new JAXBElement<TextType>(_SourceTypeTitle_QNAME, TextType.class, SourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "category", scope = SourceType.class)
    public JAXBElement<CategoryType> createSourceTypeCategory(CategoryType value) {
        return new JAXBElement<CategoryType>(_SourceTypeCategory_QNAME, CategoryType.class, SourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "updated", scope = SourceType.class)
    public JAXBElement<DateTimeType> createSourceTypeUpdated(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_SourceTypeUpdated_QNAME, DateTimeType.class, SourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contributor", scope = SourceType.class)
    public JAXBElement<PersonType> createSourceTypeContributor(PersonType value) {
        return new JAXBElement<PersonType>(_SourceTypeContributor_QNAME, PersonType.class, SourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "link", scope = SourceType.class)
    public JAXBElement<LinkType> createSourceTypeLink(LinkType value) {
        return new JAXBElement<LinkType>(_SourceTypeLink_QNAME, LinkType.class, SourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rights", scope = SourceType.class)
    public JAXBElement<TextType> createSourceTypeRights(TextType value) {
        return new JAXBElement<TextType>(_SourceTypeRights_QNAME, TextType.class, SourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subtitle", scope = SourceType.class)
    public JAXBElement<TextType> createSourceTypeSubtitle(TextType value) {
        return new JAXBElement<TextType>(_SourceTypeSubtitle_QNAME, TextType.class, SourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneratorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "generator", scope = SourceType.class)
    public JAXBElement<GeneratorType> createSourceTypeGenerator(GeneratorType value) {
        return new JAXBElement<GeneratorType>(_SourceTypeGenerator_QNAME, GeneratorType.class, SourceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVKnowledgeRequestNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REDS_MT010001UV.knowledgeRequestNotification")
    public JAXBElement<REDSMT010001UVKnowledgeRequestNotification> createREDSMT010001UVKnowledgeRequestNotification(REDSMT010001UVKnowledgeRequestNotification value) {
        return new JAXBElement<REDSMT010001UVKnowledgeRequestNotification>(_REDSMT010001UVKnowledgeRequestNotification_QNAME, REDSMT010001UVKnowledgeRequestNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "entry")
    public JAXBElement<EntryType> createEntry(EntryType value) {
        return new JAXBElement<EntryType>(_Entry_QNAME, EntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVTaskContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "taskContext")
    public JAXBElement<REDSMT010001UVTaskContext> createTaskContext(REDSMT010001UVTaskContext value) {
        return new JAXBElement<REDSMT010001UVTaskContext>(_TaskContext_QNAME, REDSMT010001UVTaskContext.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVPatientContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "patientContext")
    public JAXBElement<REDSMT010001UVPatientContext> createPatientContext(REDSMT010001UVPatientContext value) {
        return new JAXBElement<REDSMT010001UVPatientContext>(_PatientContext_QNAME, REDSMT010001UVPatientContext.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVInformationRecipient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "informationRecipient")
    public JAXBElement<REDSMT010001UVInformationRecipient> createInformationRecipient(REDSMT010001UVInformationRecipient value) {
        return new JAXBElement<REDSMT010001UVInformationRecipient>(_InformationRecipient_QNAME, REDSMT010001UVInformationRecipient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVSubTopic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subTopic")
    public JAXBElement<REDSMT010001UVSubTopic> createSubTopic(REDSMT010001UVSubTopic value) {
        return new JAXBElement<REDSMT010001UVSubTopic>(_SubTopic_QNAME, REDSMT010001UVSubTopic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVPerformer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "performer")
    public JAXBElement<REDSMT010001UVPerformer> createPerformer(REDSMT010001UVPerformer value) {
        return new JAXBElement<REDSMT010001UVPerformer>(_Performer_QNAME, REDSMT010001UVPerformer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "feed")
    public JAXBElement<FeedType> createFeed(FeedType value) {
        return new JAXBElement<FeedType>(_Feed_QNAME, FeedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVMainSearchCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mainSearchCriteria")
    public JAXBElement<REDSMT010001UVMainSearchCriteria> createMainSearchCriteria(REDSMT010001UVMainSearchCriteria value) {
        return new JAXBElement<REDSMT010001UVMainSearchCriteria>(_MainSearchCriteria_QNAME, REDSMT010001UVMainSearchCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVEncounter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "encounter")
    public JAXBElement<REDSMT010001UVEncounter> createEncounter(REDSMT010001UVEncounter value) {
        return new JAXBElement<REDSMT010001UVEncounter>(_Encounter_QNAME, REDSMT010001UVEncounter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregateKnowledgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "aggregateKnowledgeResponse")
    public JAXBElement<AggregateKnowledgeResponse> createAggregateKnowledgeResponse(AggregateKnowledgeResponse value) {
        return new JAXBElement<AggregateKnowledgeResponse>(_AggregateKnowledgeResponse_QNAME, AggregateKnowledgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVPatient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "patient", scope = REDSMT010001UVPerformer.class)
    public JAXBElement<REDSMT010001UVPatient> createREDSMT010001UVPerformerPatient(REDSMT010001UVPatient value) {
        return new JAXBElement<REDSMT010001UVPatient>(_REDSMT010001UVPerformerPatient_QNAME, REDSMT010001UVPatient.class, REDSMT010001UVPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVHealthCareProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "healthCareProvider", scope = REDSMT010001UVPerformer.class)
    public JAXBElement<REDSMT010001UVHealthCareProvider> createREDSMT010001UVPerformerHealthCareProvider(REDSMT010001UVHealthCareProvider value) {
        return new JAXBElement<REDSMT010001UVHealthCareProvider>(_REDSMT010001UVPerformerHealthCareProvider_QNAME, REDSMT010001UVHealthCareProvider.class, REDSMT010001UVPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVServiceDeliveryLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "serviceDeliveryLocation", scope = REDSMT010001UVEncounter.class)
    public JAXBElement<REDSMT010001UVServiceDeliveryLocation> createREDSMT010001UVEncounterServiceDeliveryLocation(REDSMT010001UVServiceDeliveryLocation value) {
        return new JAXBElement<REDSMT010001UVServiceDeliveryLocation>(_REDSMT010001UVEncounterServiceDeliveryLocation_QNAME, REDSMT010001UVServiceDeliveryLocation.class, REDSMT010001UVEncounter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVPatient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "patient", scope = REDSMT010001UVInformationRecipient.class)
    public JAXBElement<REDSMT010001UVPatient> createREDSMT010001UVInformationRecipientPatient(REDSMT010001UVPatient value) {
        return new JAXBElement<REDSMT010001UVPatient>(_REDSMT010001UVPerformerPatient_QNAME, REDSMT010001UVPatient.class, REDSMT010001UVInformationRecipient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVHealthCareProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "healthCareProvider", scope = REDSMT010001UVInformationRecipient.class)
    public JAXBElement<REDSMT010001UVHealthCareProvider> createREDSMT010001UVInformationRecipientHealthCareProvider(REDSMT010001UVHealthCareProvider value) {
        return new JAXBElement<REDSMT010001UVHealthCareProvider>(_REDSMT010001UVPerformerHealthCareProvider_QNAME, REDSMT010001UVHealthCareProvider.class, REDSMT010001UVInformationRecipient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVHolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "holder", scope = REDSMT010001UVKnowledgeRequestNotification.class)
    public JAXBElement<REDSMT010001UVHolder> createREDSMT010001UVKnowledgeRequestNotificationHolder(REDSMT010001UVHolder value) {
        return new JAXBElement<REDSMT010001UVHolder>(_REDSMT010001UVKnowledgeRequestNotificationHolder_QNAME, REDSMT010001UVHolder.class, REDSMT010001UVKnowledgeRequestNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVPatientContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "patientContext", scope = REDSMT010001UVKnowledgeRequestNotification.class)
    public JAXBElement<REDSMT010001UVPatientContext> createREDSMT010001UVKnowledgeRequestNotificationPatientContext(REDSMT010001UVPatientContext value) {
        return new JAXBElement<REDSMT010001UVPatientContext>(_PatientContext_QNAME, REDSMT010001UVPatientContext.class, REDSMT010001UVKnowledgeRequestNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVSubTopic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subTopic", scope = REDSMT010001UVKnowledgeRequestNotification.class)
    public JAXBElement<REDSMT010001UVSubTopic> createREDSMT010001UVKnowledgeRequestNotificationSubTopic(REDSMT010001UVSubTopic value) {
        return new JAXBElement<REDSMT010001UVSubTopic>(_SubTopic_QNAME, REDSMT010001UVSubTopic.class, REDSMT010001UVKnowledgeRequestNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVInformationRecipient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "informationRecipient", scope = REDSMT010001UVKnowledgeRequestNotification.class)
    public JAXBElement<REDSMT010001UVInformationRecipient> createREDSMT010001UVKnowledgeRequestNotificationInformationRecipient(REDSMT010001UVInformationRecipient value) {
        return new JAXBElement<REDSMT010001UVInformationRecipient>(_InformationRecipient_QNAME, REDSMT010001UVInformationRecipient.class, REDSMT010001UVKnowledgeRequestNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVPerformer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "performer", scope = REDSMT010001UVKnowledgeRequestNotification.class)
    public JAXBElement<REDSMT010001UVPerformer> createREDSMT010001UVKnowledgeRequestNotificationPerformer(REDSMT010001UVPerformer value) {
        return new JAXBElement<REDSMT010001UVPerformer>(_Performer_QNAME, REDSMT010001UVPerformer.class, REDSMT010001UVKnowledgeRequestNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVEncounter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "encounter", scope = REDSMT010001UVKnowledgeRequestNotification.class)
    public JAXBElement<REDSMT010001UVEncounter> createREDSMT010001UVKnowledgeRequestNotificationEncounter(REDSMT010001UVEncounter value) {
        return new JAXBElement<REDSMT010001UVEncounter>(_Encounter_QNAME, REDSMT010001UVEncounter.class, REDSMT010001UVKnowledgeRequestNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVSeverityObservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "severityObservation", scope = REDSMT010001UVMainSearchCriteria.class)
    public JAXBElement<REDSMT010001UVSeverityObservation> createREDSMT010001UVMainSearchCriteriaSeverityObservation(REDSMT010001UVSeverityObservation value) {
        return new JAXBElement<REDSMT010001UVSeverityObservation>(_REDSMT010001UVMainSearchCriteriaSeverityObservation_QNAME, REDSMT010001UVSeverityObservation.class, REDSMT010001UVMainSearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "healthCarePerson", scope = REDSMT010001UVHealthCareProvider.class)
    public JAXBElement<REDSMT010001UVPerson> createREDSMT010001UVHealthCareProviderHealthCarePerson(REDSMT010001UVPerson value) {
        return new JAXBElement<REDSMT010001UVPerson>(_REDSMT010001UVHealthCareProviderHealthCarePerson_QNAME, REDSMT010001UVPerson.class, REDSMT010001UVHealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "patientPerson", scope = REDSMT010001UVPatient.class)
    public JAXBElement<REDSMT010001UVPerson> createREDSMT010001UVPatientPatientPerson(REDSMT010001UVPerson value) {
        return new JAXBElement<REDSMT010001UVPerson>(_REDSMT010001UVPatientPatientPerson_QNAME, REDSMT010001UVPerson.class, REDSMT010001UVPatient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVAuthorizedPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "assignedAuthorizedPerson", scope = REDSMT010001UVAssignedEntity.class)
    public JAXBElement<REDSMT010001UVAuthorizedPerson> createREDSMT010001UVAssignedEntityAssignedAuthorizedPerson(REDSMT010001UVAuthorizedPerson value) {
        return new JAXBElement<REDSMT010001UVAuthorizedPerson>(_REDSMT010001UVAssignedEntityAssignedAuthorizedPerson_QNAME, REDSMT010001UVAuthorizedPerson.class, REDSMT010001UVAssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REDSMT010001UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "representedOrganization", scope = REDSMT010001UVAssignedEntity.class)
    public JAXBElement<REDSMT010001UVOrganization> createREDSMT010001UVAssignedEntityRepresentedOrganization(REDSMT010001UVOrganization value) {
        return new JAXBElement<REDSMT010001UVOrganization>(_REDSMT010001UVAssignedEntityRepresentedOrganization_QNAME, REDSMT010001UVOrganization.class, REDSMT010001UVAssignedEntity.class, value);
    }

}
