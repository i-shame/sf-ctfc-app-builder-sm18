# Security

> Exam Weight : 10%

## Data Security

> Control access to data using point-and-click security tools.

### Overview of Data Security

- Explain the importance of giving the right people access to the right data.
	- Choosing the data set each user or group of users can see is one of the key decisions that affects the security of your Salesforce org or app
	- With the Salesforce platform’s flexible, layered sharing model, it’s easy to assign different data sets to different sets of users. You can balance security and convenience, reduce the risk of stolen or misused data, and still make sure all users can easily get the data they need.
- List the four levels at which you can control data access.
	- You can control which users have access to which data in your whole org, a specific object, a specific field, or an individual record.
		- Organization: you can maintain a list of authorized users, set password policies, and limit logins to certain hours and locations.
		- Objects: By setting permissions on a particular type of object, you can prevent a group of users from creating, viewing, editing, or deleting any records of that object
		- Fields: You can restrict access to certain fields, even if a user has access to the object
		- Records: You can allow particular users to view an object, but then restrict the individual object records they're allowed to see. You can manage record-level access in these four ways.
			- Organization-wide defaults specify the default level of access users have to each others’ records. You use org-wide sharing settings to lock down your data to the most restrictive level, and then use the other record-level security and sharing tools to selectively give access to other users.
			- Role hierarchies give access for users higher in the hierarchy to all records owned by users below them in the hierarchy. Role hierarchies don’t have to match your organization chart exactly. Instead, each role in the hierarchy should represent a level of data access that a user or group of users needs.
			- Sharing rules are automatic exceptions to organization-wide defaults for particular groups of users, so they can get to records they don’t own or can’t normally see. Sharing rules, like role hierarchies, are only used to give additional users access to records. They can’t be stricter than your organization-wide default settings.
			- Manual sharing allows owners of particular records to share them with other users. Although manual sharing isn’t automated like org-wide sharing settings, role hierarchies, or sharing rules, it can be useful in some situations, such as when a recruiter going on vacation needs to temporarily assign ownership of a job application to someone else.

				scribe a typical scenario for limiting data access at each of the four levels.	![](https://res.cloudinary.com/hy4kyit2a/image/upload/f_auto,q_auto/doc/trailhead/en-usab1b4360799e29b571fb9fc51cd003e8.jpg)

#### Quizs

- You can configure access to data at all of the following levels, except:
	- Organization
	- Objects
	- **Page Layouts**
	- Records
- You can secure data at the organization level, using all of these methods, except:
	- Limit login IP addresses
	- Limit login hours
	- Set password policies
	- **Use hardware token**
- Which of these is not a method for controlling record-level access?
	- Organization-Wide Defaults
	- Role Hierarchy
	- **Profiles**
	- Sharing Rules

### Control Access to the Org

- Create, view, and manage users.
	- You can create users—even multiple users—in just a few clicks. It’s as simple as entering a username, alias, and email, and selecting a role, license, and profile.
	- You can't delete a user, but you can deactivate an account so a user can’t log in. Deactivated users lose access to all records. However, you can still transfer this data to other users and view the names on the Users page.
- Set password policies.
	- You can configure several settings to ensure that your users’ passwords are strong and secure.
		- Password policies
		- User password expiration
		- User password resets
			 Login attempts and lockout periods		
- Limit the IP addresses from which users can log in.
	- By default, Salesforce doesn't restrict locations for login access. If you do nothing, users can log in from any IP address.
	- If you set your trusted IP range for your whole org, users with addresses outside that range aren't completely excluded. They can log in if they complete a challenge question, typically by entering an activation code sent to their phone or email.
	- If you set your trusted IP range only for a given user profile, all users with that profile who are outside the trusted range are locked out.
- Limit the times at which users can log in.
	- For each profile, you can specify the hours when users can log in.
	- If users are logged in when their login hours end, they can continue to view their current page, but they can’t take any further action.

### Control Access to Objects

> The simplest way to control data access is to set permissions on a particular type of object.

- Manage Object Permissions

	- You can set object permissions with profiles or permission sets. A user can have one profile and many permission sets.
	- A profile is a collection of settings and permissions. Standard Profiles:Read Only, Standard User, Marketing User, Contract Manager, System Administrator
	- A permission set is a collection of settings and permissions that give users access to various tools and functions. The settings and permissions in permission sets are also found in profiles, but permission sets extend users’ functional access without changing their profiles.
	- Users can have only one profile, but they can have multiple permission sets.
	- Use profiles to grant the minimum permissions and settings that all users of a particular type need. Then use permission sets to grant more permissions as needed.

### Control Access to Fields

> Defining field-level security for sensitive fields is the second piece of the security and sharing puzzle, after controlling object-level access.

- Field-level security settings—or field permissions—control whether a user can see, edit, and delete the value for a particular field on an object
- Unlike page layouts, which only control the visibility of fields on detail and edit pages, field-level security controls the visibility of fields in any part of the app, including related lists, list views, reports, and search results

### Control Access to Records

> To control data access precisely, you can allow particular users to view specific fields in a specific object, but then restrict the individual records they're allowed to see.First ask yourself these questions:

- Should your users have open access to every record, or just a subset?
- If it’s a subset, what rules should determine whether the user can access them?

You control record-level access in four ways. You use org-wide defaults to lock down your data to the most restrictive level, and then use the other record-level security tools to grant access to selected users, as required.

- Org-wide defaults specify the default level of access users have to each other’s records.
- Role hierarchies ensure managers have access to the same records as their subordinates. Each role in the hierarchy represents a level of data access that a user or group of users needs.
- Sharing rules are automatic exceptions to org-wide defaults for particular groups of users, to give them access to records they don’t own or can’t normally see.
- Manual sharing lets record owners give read and edit permissions to users who might not have access to the record any other way.

![](https://res.cloudinary.com/hy4kyit2a/image/upload/f_auto,q_auto/doc/trailhead/en-uscac30d566a68bfc4a34f3b9607be2a66.png)

### Extend Access with Sharing Rules

> You can open access back up for some users with sharing rules. Sharing rules can be based on who owns the record or on the values of fields in the record.

Each sharing rule has three components.

- Share which records?
- With which users?
- What kind of access?

#### Define a Public Group

- Before creating a sharing rule, it’s important to set up the appropriate public group. A public group is a collection of individual users, other groups, individual roles, and/or roles with their subordinates that all have a function in common. 

- Using a public group when defining a sharing rule makes the rule easier to create and, more important, easier to understand later, especially if it's one of many sharing rules that you're trying to maintain in a large organization. Create a public group if you want to define a sharing rule that encompasses more than one or two groups or roles, or any individual.

## Identity Basics

> Secure your org so users can log in once to access a variety of apps, orgs, and services.

### Get to Know Salesforce Identity

- Describe how Salesforce Identity helps administrators.

	- Salesforce Identity lets you give the right people the right access to the right resources at the right time. You control who can access your orgs and who can use apps running on the Salesforce Platform, on-premises, in other clouds, and on mobile devices.


- Understand how Salesforce Identity can benefit a business. When users can sign in once to access all the apps that they need, everyone benefits.

	- Users don’t have to remember lots of usernames and passwords.
	- Admins spend less time dealing with user login woes.
	- Developers build web and mobile applications that work seamlessly with existing business processes.
	- CIOs strengthen security and trust while harnessing their authentication investment.
	- Customers collaborate and get their questions answered without hassle.
	- Partners integrate their solutions with your Salesforce org, making it a big win for everyone.

- Main features of Salesforce Identity
	
	- Single sign-on (SSO) lets users access all authorized resources without logging in separately to each one—and without having to create (and remember) different user credentials for each app.
	- Connected apps
	- Social sign-on
	- Two-factor authentication
	- My Domain
	- Centralized user account management
	- User provisioning
	- Identity Connect
	- App Launcher
	
#### Quizs

- How do admins and businesses benefit from Salesforce Identity?
	-  **Convenient one-click access to all apps so users can be more productive.**
	-  Users create more passwords, which provides higher levels of security.
	-  Decentralized user management.
	-  Admins can log in as any user in their org.
- What's the difference between single sign-on (SSO) and social sign-on?
	-  With SSO, users log in to each service they access. With social sign-on, users can log in using their social account credentials.
	-  **With SSO, users can access services without logging in to each one. With social sign-on, users can access a service using their social account credentials.**
	-  My Domain is required for SSO but not for social sign-on.
	-  My Domain is required for social sign-on but not for SSO.
- What is a benefit of using the My Domain feature?
	-  Brand your login page.
	-  Create a user-friendly URL to your Salesforce org.
	-  Enable single sign-on.
	-  **All of the above**
- How do users benefit from Salesforce Identity?
	-  They can personalize their login page.
	-  **They can use one username and password to access everything they need.**
	-  They can access Salesforce from outside the office.
	-  They can update their social media account through Salesforce.
- Which of the following is a benefit for customers and partners but not employees?
	-  Single sign-on
	-  Two-factor authentication
	-  My Domain
	-  **Self-registration**
- What is important to consider when customizing user registration for your org or community?
	-  Ensuring that users see the Salesforce brand throughout the process
	-  **Launching other business processes to support registration**
	-  Automatically signing up new users to receive all your marketing emails
	-  Including a brief user survey to collect feedback about your registration process
- Which protocol allows secure data sharing between applications?
	-  **OAuth**
	-  SAML
	-  XML
	-  OpenID Connect
- Which language is SAML based on?
	-  Apex
	-  Visualforce
	-  JavaScript
	-  **XML**
- Which of the following is true when Salesforce acts as an identity provider to an external application?
	-  **A user authenticated in an external application can flow through to Salesforce.**
	-  A user logged in to Salesforce can flow through to the external application.
	-  Salesforce is using the IdP from an external org to authenticate to a Salesforce org.
	-  None of these. Salesforce can only act as a service provider.

## Security Basics
`Educate your users, protect your Salesforce org, and encourage a culture of security.`

Let’s talk about human nature. Criminals have learned they can exploit typical human emotions and reactions to steal credentials and infiltrate your network.

- **Fear**: “If you don’t give me the information, I will report you to your manager.”
- **Trust**: Authentic-looking email from your bank: “Your account has just been closed. Click here to reactivate.”
- **Morality**: “Can you hold that office door open for me? My arm’s broken, and this package is heavy.”
- **Rewards**: “My company is considering investing in your products. Can you answer a few questions about your organization first?”
- **Conformity**: “Bill Stevens from Finance always gives me updates about Q2 earning, but I can’t get a hold of him. Can you help me with the report?”
- **Curiosity**: “Wow… Check out this video of a giant snake eating a zookeeper!”

These entry point methods represent common techniques that cybercriminals use to prey on our humanity and get what they want.

- **Phishing** and **Malware**: An attempt to acquire sensitive information, such as usernames, passwords, and credit card details, by masquerading as a trustworthy entity. This method is used to trick users into downloading software intended to damage or control a device or network.
- **Social Engineering**: In the context of security, social engineering is the art of manipulating people into taking action or revealing confidential information.
- **Exploiting Public Info**: Using publicly available information to help design a social engineering attack, crack a password login, or create a targeted phishing email.
- **Badge Surfing**: Getting into a secured area, either by following a legitimate badge holder in or by somehow persuading that person to let them in.
- **Eavesdropping**: Secretly listening in on private conversations.
- **Dumpster Diving**: Collecting information from the recycling or trash that was not appropriately destroyed.
- **Installing Rogue Devices**:Installing wireless routers or USB thumb drives where they can give a hacker access to a secure network.


#### Quizs
-  Your company's top security vulnerability today is:
  -  High office rents
  -  Burglars getting into the file cabinets
  -  Copyright infringement by competitors
  -  **Employees inadvertently giving out information**
-  What are some of the common human behaviors that cybercriminals exploit?
  -  Morality, envy, and trust
  -  Boredom, curiosity, and fear
  -  **Conformity, trust, and curiosity**
  -  Fear, hatred, envy, and jealousy
-  What is one of the methods that criminals use to get information illegitimately?
  -  **Phishing**
  -  Ghosting
  -  Trolling
  -  Tubthumping

-  What makes a strong password?
     -  At least 6 characters
     -  Your dog's name
     -  Your phone number
     -  **Both letters and numbers**
     -  Your dog's phone number
-  What are some ways that you can protect against phishing emails?
     -  Validate the sender, do a web search for the subject line, and call 911.
     -  **Do a web search for the subject line, check trust.salesforce.com, and train users to recognize phishing.**
     -  Train users to recognize phishing and change your password.
     -  Validate the sender, turn off your computer, and leave the building.
-  What should you do when you assign user permissions?
     -  Think twice before adding a permission to a user profile.
     -  Add lots of admins. You need all the help you can get!
     -  Reassess users' permissions when their jobs change.
     -  **A and C**
     -  All of the above

-  Which of these are built-in Salesforce security features?
  -  **Two-factor authentication, login IP ranges, and session security levels**
  -  Salesforce Shield
  -  Retinal scanning
  -  Incognito web browsing
-  Multitenancy means:
  -  Your company shares a floor in a building with another company.
  -  You use the same cubicle in the morning that your coworker uses in the afternoon.
  -  **Multiple organizations use the same Salesforce data infrastructure.**
  -  You keep fruits and vegetables on the same refrigerator shelf.
-  Which of these affects what data users can see?
  -  The IP address they log in from
  -  The permissions associated with their user profile
  -  The security level of their current session
  -  **All of the above**