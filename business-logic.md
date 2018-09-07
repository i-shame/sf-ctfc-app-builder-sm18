# Business Logic and Process Automation

- レコードタイプの機能とユースケースを説明する
Describe the capabilities of and use cases for record types.
- 数式項目の機能とユースケースを説明する
Describe the capabilities of and use cases for formula fields.
- 積み上げ集計項目の機能、ユースケースおよび影響を説明する
Describe the capabilities of, use cases for, and implications of roll-up summary fields.
- 入力規則の機能とユースケースを説明する
Describe the capabilities of and use cases for validation rules.
- 承認プロセスの機能とユースケースを説明する
Describe the capabilities of and use cases for approval processes.
- ワークフロー、Visual Workflow、プロセスビルダーの機能とユースケースを説明する
Describe the capabilities of and use cases for workflow, visual workflow, and Process Builder.
- 与えられた複数のビジネス要件に従って、ビジネスプロセスを自動化するソリューションを推奨する
Given a set of business requirements, recommend a solution to automate business processes.
- 項目自動更新によって生じる問題と再帰の可能性を説明する
Describe the ramifications of field updates and the potential for recursion.

## User Management
> Set up users and control how they can view or edit your business data.

### What is a user?
> A user is anyone who logs in to Salesforce. Users are employees at your company, such as sales reps, managers, and IT specialists, who need access to the company's records.

#### Key Terms
- Usernames:　Each user has both a username and an email address. The username must be formatted like an email address and must be unique across all Salesforce organizations
	- Each user must have a username that is unique across all Salesforce organizations (not just yours).
	- Users must have a username in the format of an email address (that is, jdoe@domain.com), but they don't have to use a real email address
	- Users can have the same email address across organizations.
- User Licenses: determines which features the user can access in Salesforce (if you have to grant a user access to Chatter without allowing them to see any data in Salesforce, you can give them a Chatter Free license.)
- Profiles: determine what users can do in Salesforce.　They come with a set of permissions which grant access to particular objects, fields, tabs, and records
- Roles: determine what users can see in Salesforce based on where they are located in the role hierarchy. Users at the top of the hierarchy can see all the data owned by users below them. Users at lower levels can't see data owned by users above them, or in other branches, unless sharing rules grant them access. Roles are optional but each user can have only one.
- Alias: is a short name to identify the user on list pages, reports, or other places where their entire name doesn't fit

#### Quizs

- Usernames must:
	- Include a character, a symbol, and an emoji.
	- Be unique only within your (not all) Salesforce organizations.
	- **Be in the format of an email, for example, jdoe@domain.com.**
	- Always start with the last name first.
- When you create a user, you can:
	- Add only one user at a time.
	- Take a long lunch break because you’ve saved so much time.
	- **Generate a new password and notify the user immediately.**
	- Replace existing users.
	
### Control What Your Users Can Access

You can configure access to data in Salesforce at four main levels.

- Organization: At the highest level, you can secure access to your organization by maintaining a list of authorized users, setting password policies, and limiting login access to certain hours and certain locations.
- Objects: Object–level security provides the simplest way to control which users have access to which data. By setting permissions on a particular type of object, you can prevent a group of users from creating, viewing, editing, or deleting any records of that object
- Fields: You can use field–level security to restrict access to certain fields, even for objects a user has access to
- Records: To control data with greater precision, you can allow particular users to view an object, but then restrict the individual object records they're allowed to see.You can manage record–level access in the following ways
	- Organization–wide defaults specify the default level of access users have to each others' records
	- Role hierarchies open up access to those higher in the hierarchy so they inherit access to all records owned by users below them in the hierarchy
	- Sharing rules enable you to make automatic exceptions to organization–wide defaults for particular groups of users, to give them access to records they don't own or can't normally see
	- Manual sharing allows owners of particular records to share them with other users

#### Quizs
- Field-level security allows you to:
	- **Restrict access to certain fields on object records.**
	- Set passwords on specific fields.
	- Make information harder to find.
	- Prevent a group of users from accessing and modifying specific objects.
- You can manage record-level access in your organization using:
	- Organization-wide defaults.
	- Role hierarchies.
	- Sharing rules.
	- Manual sharing.
	- **All of the above.**

## Formulas & Validations

> Tailor your apps without writing code by using point-and-click logic.  

### Formula Fields

- You’ve got a lot of data in your organization. Your users need to access and understand this data at-a-glance without doing a bunch of calculations in their heads. Enter formula fields, the powerful tool that gives you control of how your data is displayed.

### Roll-Up Summary Field
> Since roll-up summary fields are based on master-detail relationships, it’s useful to review object relationships before creating a roll-up summary field.

- While formula fields calculate values using fields within a single record, roll-up summary fields calculate values from a set of related records, such as those in a related list. You can create roll-up summary fields that automatically display a value on a master record based on the values of records in a detail record. These detail records must be directly related to the master through a master-detail relationship. 

### Validation Rules

- Validation rules verify that data entered by users in records meet the standards you specify before they can save it. A validation rule can contain a formula or expression that evaluates the data in one or more fields and returns a value of “True” or “False.” 

## Lightning Flow
> Automate processes for every app, experience, and portal with declarative tools.

Lightning Flow provides declarative process automation for every Salesforce app, experience, and portal.

Lightning Flow does support automating how a record gets submitted for approval

Included in Lightning Flow are two point-and-click automation tools: Process Builder, which lets you build processes, and Cloud Flow Designer, which lets you build flows.

To sum up the differences:

- **Lightning Flow** is the name of the product.
- **Process Builder** and **Cloud Flow Designer** are the names of the tools.
- Use Process Builder to make **processes**; use Cloud Flow Designer to make **flows**.

|Use Case|Lightning Flow Functionality|
| ---- | ---- |
|Create a guided tutorial or wizard with screens.|Cloud Flow Designer includes several out-of-the-box screen fields, like text boxes, radio buttons, and a file-upload component. If you need more than what’s offered, add custom Lightning components to your screens.|
|Set up automated tasks and processes.|Declaratively configure logic and actions for your business process with either Process Builder or Cloud Flow Designer. If needed, you can build custom Apex code to fill any functional gaps.|
|Connect to external systems.|Communicate changes between your Salesforce org and your external systems with platform events. Process Builder and Cloud Flow Designer let you respond to and send platform event messages. In addition, Cloud Flow Designer can retrieve data from third-party systems with External Services.|
|Add automation to your pages and apps.|Make sure your behind-the-scenes processes start when the right thing happens, whether that’s when records change or when users click a particular button.<br />Once you build guided visual experiences, add them to Lightning pages, Community pages, the utility bar in your Lightning apps, and more.|
|Reuse what you build.|In Cloud Flow Designer, any flow can be used as a subflow. <br />In Process Builder, create an invocable process to reuse that process’s logic or actions in other business processes.|

`QUIZS`

- Which tools are included with the Lightning Flow product?
	- Lightning Experience and Cloud Flow Designer
	- Lightning App Builder and Process Builder
	- **Process Builder and Cloud Flow Designer**
	- Process Builder, Cloud Flow Designer, and Approvals
- Which declarative tool would you use for the following use case? Guide customers through the process of troubleshooting issues with your product.
	- Process Builder
	- **Cloud Flow Designer**
	- Approvals
	- Apex
- Which declarative tool would you use for the following use case? When an opportunity's discount is higher than 40%, notify the CEO via email and request sign-off. Provide a way for the CEO to leave comments.
	- Process Builder
	- Cloud Flow Designer
	- **Approvals**
	- Apex
- Which declarative tool would you use for the following use case? When the Annual Revenue field exceeds $500,000 on an account, automatically update the Customer Priority field to High.
	- **Process Builder**
	- Cloud Flow Designer
	- Approvals
	- Apex

### Process Builder

> Process Builder is a point-and-click tool that lets you easily automate if/then business processes and see a graphical representation of your process as you build.  

Every process consists of a trigger, at least one criteria node, and at least one action. 

- Trigger: Identify When the Process Should Run
	- Only when a record is created
	- Anytime a record is created or edited
- Criteria: Determine Whether or Not to Execute Actions
	- Set filter conditions.
	- Enter a custom formula. Like in validation rules, the formula must resolve to true or false.
	- Opt out of criteria and always execute the associated actions.
- Actions: What the Process Should Do
	- Each immediate action is executed as soon as the criteria evaluates to true.
	- Each scheduled action is executed at the specified time, such as 10 days before the record’s close date or 2 days from now
	- Regardless of when the actions execute, here are some of the things you can do with a process action.
		- Create records.
		- Update the record that started the process or any related record.
		- Submit that record for approval.
		- Update one or more related records.
		- Send emails using a specified email template.
		- Post to a Chatter feed.

Process Builder can’t:`(You don’t have to rebuild the whole thing in another tool. Configure the more complex functionality in a flow, and then add a flow action to your process. If a flow also can’t do what you need, you or a developer can write Apex to do so. Then add an Apex action to your process.)`

- Post to a community feed
- Submit a related record for approval
- Delete records
- Create a bunch of records and associate them with each other
- Perform complex logic


### Cloud Flow Designer

`You may also have heard the term Visual Workflow. That’s a retired product name for designing, managing, and running flows. Visual Workflow has been superseded by Lightning Flow.`

You may have heard several terms used interchangeably when referring to flows. As a reminder, the official terms are:

- **Lightning Flow**—the product that encompasses building, managing, and running flows and processes.
- **Cloud Flow Designer**—a point-and-click tool for building flows.
- **Flow**—an application that automates a business process by collecting data and doing something in your Salesforce org or an external system.

In short, the **Lightning Flow** product includes a couple of tools. One of them, the **Cloud Flow Designer**, helps you create **flows**.

Flow elements fit into four different categories.
- **Screen**: Display data to your users or collect information from them with Screen elements
- **Logic**: Control the flow of... well, your flow. Create branches, update data, loop over sets of data, or wait for a particular time.
- **Actions**: Do something in Salesforce when you have the necessary information. Flows can look up, create, update, and delete Salesforce records 
- **Integrations** : Connect your flow to an external database by using local actions or Apex code 

`Quizs`
- An sObject variable can store
	- A single value
	- **A set of field values for a single record**
	- Multiple values of the same data type
	- A set of field values for multiple records that have the same object
- For which use case is it appropriate to combine a process and a flow?
	- Post to an internal Chatter group.
	- Clone a record and its children.
	- Delete a related record.
	- **B and C**
- Inside a loop, you should avoid:
	- **Executing actions, like creating or updating records.**
	- Assigning new values to variables.
	- Displaying data to the user.
	- Nesting another loop.

### Approvals

An approval process automates how Salesforce records are approved in your org. In an approval process, you specify:

- The steps necessary for a record to be approved and who approves it at each step.  
- The actions to take based on what happens during the approval process.

Build an Approval Process

![](https://res.cloudinary.com/hy4kyit2a/image/upload/f_auto,q_auto/doc/trailhead/en-us99ae839ecc6554de0bbddadd9d4a8543.png)

### Workflow Rule Migration 

Salesforce no longer enhancing Workflow. They still support your use of workflow rules, and will continue to do so. But all new functionality for the workflow use case will come through Process Builder. If you want to use the shiny new functionality, migrate your automation to Process Builder.

Let’s Compare: Workflow vs. Process Builder

- Process Builder lets you automate more things: Process Builder includes more flexible actions compared with the corresponding workflow actions
	- The Create a Record process action lets you create any record instead of just tasks
	- The Update Records process action lets you update any related record, while the field update workflow action lets you update only the record or its parent.
	- Process Builder also includes brand new actions that aren’t available in Workflow—such as Post to Chatter and Submit for Approval.
- Process Builder lets you control the order of your criteria.
	- In Workflow, there’s no way for you to determine which order your workflow rules run in
	- In Process Builder, you determine the exact evaluation order of your process’ criteria. In turn, within a given process criteria, you determine the order of its actions.
- Process Builder lets you access fields on every related record.
	- In Workflow, you can reference fields on the record’s parent. Process Builder, on the other hand, lets you access the fields on any related record, no matter how far away that record is.

`Quizs`
- Why should you use Process Builder instead of Workflow?
  - You get jazzy new features.
  - Process Builder includes new actions, and the actions you're already familiar with are more flexible.
  - Process Builder lets you determine the order of your automations.
  - **All of the above**
- Which action is available in Process Builder but not Workflow?
  - **Create a Record**
  - Outbound Messages
  - Email Alerts
  - A and B
- Select the correct order of steps for the process of converting workflow rules to processes.
  - Map your criteria, determine the order of your criteria, then map your actions.
  - Map your actions, determine the order of your criteria, then map your criteria.
  - **Map your criteria, map your actions, then determine the order of your criteria.**
  - Determine the order of your criteria, map your criteria, then map your actions.
- It's best practice to:
  - Use the most code-driven tool at your disposal.
  - **Use one automation tool for each object.**
  - Use the tool with the most features.
  - Use Apex for everything.

