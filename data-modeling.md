# Data Modeling and Management

## Data modeling
> Give your data structure with objects, fields, and relationships.When we talk about the data model, we’re talking about the collection of objects and fields in an app

### Understand Custom & Standard Objects

`Describe the perks of using objects on the Salesforce platform.`

- Salesforce supports several different types of objects. There are standard objects, custom objects, external objects, platform events, and BigObjects

`Explain the difference between standard objects and custom objects.`

- Standard objects are objects that are included with Salesforce. Common business objects like Account, Contact, Lead, and Opportunity are all standard objects.
- Custom objects are objects that you create to store information that’s specific to your company or industry. 

### Create Object Relationships

`Define the different types of object relationships and their typical use cases.`

- Lookup Relationships
    - A lookup relationship essentially links two objects together so that you can “look up” one object from the related items on another object.
    - Lookup relationships can be one-to-one or one-to-many

- Master-Detail Relationships
    - In master-detail relationships, one object is the master and another is the detail. The master object controls certain behaviors of the detail object, like who can view the detail’s data.

- More on Relationships
    - Hierarchical relationships: are a special type of lookup relationship, only available on the User object

### Work with Schema Builder

`Describe the advantages of using Schema Builder for data modeling.`

- Schema Builder is a tool that lets you visualize and edit your data model
- Schema Builder is a handy tool for introducing your Salesforce customizations to a co-worker or explaining the way data flows throughout your system.

## Data Management

### Import Data

`Salesforce offers two main methods for importing data.`

- **Data Import Wizard** 
    - This tool, accessible through the Setup menu, lets you import data in common standard objects, such as contacts, leads, accounts, as well as data in custom objects. can import up to 50,000 records at a time
    - Use the Data Import Wizard When:
        - You need to load less than 50,000 records.
        - The objects you need to import are supported by the wizard.
        - You don’t need the import process to be automated.
- **Data Loader** 
    - This is a client application that can import up to five million records at a time, of any data type, either from files or a database connection 
    - Use Data Loader When:
        - You need to load 50,000 to five million records. If you need to load more than 5 million records, we recommend you work with a Salesforce partner or visit the AppExchange for a suitable partner product.
        - You need to load into an object that is not supported by the Data Import Wizard.
        - You want to schedule regular data loads, such as nightly imports.

### Export Data

`Describe and compare the two methods of exporting data from Salesforce.`

Salesforce offers two main methods for exporting data.

- Data Export Wizard : 
    - This is an in-browser wizard, accessible through the Setup menu. 
    - It allows you to export data manually once every six days (for weekly export) or 28 days (for monthly export). 
    - You can also export data automatically, at weekly or monthly intervals.
- Data Loader : 
    - This is a client application that you must install separately. It can be operated either through the user interface or the command line. 
    - The latter option is useful if you want to automate the export process, or use APIs to integrate with another system.

#### Quiz

- The Data Export Wizard:
	- Can be operated through a command line.
	- Must be installed separately.
	- Must be installed by an actual wizard.
	- **Is accessible through the Setup menu.**
- To export data manually using the Data Export Wizard:
	- **From Setup, open Data Export and then select Export Now.**
	- Install the Data Loader client application.
	- Grow a long beard and find a magical staff.
	- Open the Data Loader bin file in a command prompt and run the Extract All command.
- The Schedule Export option can be scheduled at the following intervals:
	- Daily
	- Every other day
	- On Thursdays and twice on Tuesdays
	- Yearly
	- **Weekly or monthly**

## Salesforce Connect

> Access, display, and integrate data from an external data source in real time.

### Introduction to Salesforce Connect

- Explain what Salesforce Connect is.
	- Salesforce Connect is a framework that enables you to view, search, and modify data that’s stored outside your Salesforce org
	- Salesforce Connect lets your Salesforce org access data from a wide variety of external systems. You can integrate tables from SAP® NetWeaver Gateway, Microsoft Dynamics® NAV, and many other data sources in real time without writing a single line of code
	- We recommend that you use Salesforce Connect if most of these conditions apply.
		- You have a large amount of data that you don’t want to copy into your Salesforce org.
		- You need small amounts of data at any one time.
		- You need real-time access to the latest data.
		- You store your data in the cloud or in a back-office system, but want to display or process that data in your Salesforce org.
- Describe two typical use cases for Salesforce Connect.
- Explain how Salesforce Connect differs from extract, transform, and load (ETL) tools.
- Explain how external objects differ from standard and custom objects.
	- External objects share much of the same functionality as custom objects. For example, you can:
		- Access external objects via list views, detail pages, record feeds, custom tabs, and page layouts.
		- Define relationships between external objects and standard or custom objects to integrate data from different sources.
		- Enable Chatter feeds on external object pages for collaboration.
		- Enable create, edit, and delete operations on external objects.

#### Quiz

- Which of these statements is true for Salesforce Connect?
	- No external data is imported into your Salesforce org.
	- External data is read in real time when you request it.
	- It can be used with any data source that supports OData 2.0.
	- **All of the above.**
- Which of these is NOT an appropriate use case for Salesforce Connect?
	- You want to integrate external data without writing custom code.
	- The external data is changing frequently.
	- **You need to set up workflows and triggers for the external data.**
	- You only need real-time access to a small fraction of the external data.
- In which of these scenarios is ETL a better choice than Salesforce Connect?
	- **You need the external data to follow the sharing rules defined for your organization.**
	- You want to generate reports and charts from the external data.
	- All of the above.
- Which of these is NOT true about external objects?
	- They integrate with Salesforce APIs, Apex, Visualforce, and Chatter.
	- They can be related to other objects.
	- **You can use them in formula fields.**
	- They are automatically viewable in the Salesforce1 mobile app

## Set up Salesforce Connect

> Setting up external data integration with Salesforce Connect involves these high-level steps.

1. Create the external data source. If your external system hosts multiple services, create an external data source for each service that’s required to access the data.
2. Create the external objects and their fields. Create an external object in your Salesforce org for each external data table that you want to access. On each external object, create a custom field for each external table column that you want to access from your Salesforce org.
3. Define relationships for the external objects. Create lookup, external lookup, and indirect lookup relationship fields to provide seamless views of data across system boundaries.
4. Enable user access to external objects and their fields. Grant object and field permissions through permissions sets or profiles.
5. Set up user authentication. For each external data source that uses per-user authentication, do both of the following.
	- Enable users to authenticate to the external data source. Grant users access through permission sets or profiles.
	- Set up each user’s authentication settings. Tell your users how to set up and manage their own authentication settings for external systems in their personal settings. Alternatively, you can perform this task for each user.

> Create External Objects and syncing creates the external objects corresponding to the tables that you selected. Syncing does not store any data in Salesforce. Syncing only defines mappings to external tables or repositories that contain the data. These mappings enable Salesforce to access and search the external data.

## Integrate External Data

### Define Relationships for the External Objects

- **Lookup relationship**—Links a child standard, custom, or external object to a parent standard or custom object. You can only use this type of relationship if the external data includes a column that identifies related Salesforce records by their 18-character IDs. If that’s not the case, use one of the following two types of relationships, which are unique to external objects.
- **External lookup relationship**—Links a child standard, custom, or external object to a parent external object. The values of the standard External ID field on the parent external object are matched against the values of the external lookup relationship field. For a child external object, the values of the external lookup relationship field come from the specified External Column Name.
- **Indirect lookup relationship**—Links a child external object to a parent standard or custom object. You select a custom unique, external ID field on the parent object to match against the child’s indirect lookup relationship field, whose values are determined by the specified External Column Name.
