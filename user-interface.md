# User Interface

- ユーザインターフェースのカスタマイズオプションを説明する
 Describe the user interface customization options.
- カスタムボタン、リンク、およびアクションの機能とユースケースを説明する
 Describe the capabilities of and use cases for custom buttons, links, and actions.
- アプリケーションに Lightning コンポーネントを組み込む場合に利用できる宣言的オプションを説明する
 Describe the declarative options available for incorporating Lightning Components in an application.
- 与えられたシナリオに従って、適切なユーザインターフェース設計を決定する
 Given a scenario, determine the appropriate user interface design.

## Lightning Components 
> Use Lightning Components to build modern web apps with reusable UI components.

- Describe what the Lightning Components framework is, and what it’s used for.
	- Lightning Components is a UI framework for developing web apps for mobile and desktop devices. It’s a modern framework for building single-page applications with dynamic, responsive user interfaces for Lightning Platform apps. It uses JavaScript on the client side and Apex on the server side.
- List at least five different ways you can use Lightning Components to customize Salesforce.
    - Add Apps to the Lightning Experience App Launcher
    - Add Apps to Lightning Experience and Salesforce App Navigation
    - Create Drag-and-Drop Components for Lightning App Builder and Community Builder
    - Add Lightning Components to Lightning Pages
    - Add Lightning Components to Lightning Experience Record Pages
    - Launch a Lightning Component as a Quick Action
    - Override Standard Actions with Lightning Components
    - Create Stand-Alone Apps
    - Run Lightning Components Apps Inside Visualforce Pages
    - Run Lightning Components Apps on Other Platforms with Lightning Out
    - Customize Flow Screens

`Quizs`

- Which of the following descriptions about the Lightning Component framework is true?
	- It's a UI framework for developing web apps for mobile and desktop devices.
	- It uses JavaScript on the client side and Apex on the server side.
	- It's a modern framework for building single-page applications.
	- **All of the above**
- What can you build with the Lightning Component framework?
	- Standalone app
	- Components to use inside Visualforce pages
	- Drag-and-drop components for Lightning App Builder
	- **All of the above**
- How is Lightning Components different from other web app frameworks?
	- Lightning Components is optimized for both mobile and desktop experiences and proves it with Salesforce1 and Lightning Experience.
	- Lightning Components connects natively with services provided by the Salesforce platform.
	- Lightning Components has specific opinions about how data access is performed and has specific security requirements.
	- **All of the above**

### What Is an App?

- An app is just a special kind of component! For the purposes of this module, you can think of an app as being different from a component in only two meaningful ways:

	- An app uses `<aura:application>` tags instead of `<aura:component>` tags.
	- Only an app has a Preview button in the Developer Console.

###  What Is a Component?

- As a practical matter, a component is a bundle that includes a definition resource, written in markup, and may include additional, optional resources like a controller, stylesheet, and so on. A resource is sort of like a file, but stored in Salesforce rather than on a file system.

#### Component Attributes
> Attributes on components are like instance variables in objects. They’re a way to save values that change, and a way to name those value placeholders. 

- A component attribute is the place where you can store a value
- You define a component attribute using the `<aura:attribute>` tag (attribute definitions)
- The `<aura:attribute>` tag itself takes attributes when you use it! (normaly,  attribute is defined by setting the **name** and type of the attribute)

#### Expressions
> An expression is basically a formula, or a calculation, which you place within expression delimiters (`{!` and `}`)

- An expression is any set of literal values, variables, sub-expressions, or operators that can be resolved to a single value.
- You can pass expression to another component to set the value on that component

```
<aura:component>
    <aura:attribute name="customMessage" type="String"/>
    <p> <c:helloMessage message="{!v.customMessage}"/> </p>
</aura:component>
```

#### Value Providers
> Value providers are a way to group, encapsulate, and access related data. Value providers are a complicated topic, so for now, think of `v` as an automatic variable that’s made available for you to use.

#### Attribute Data Types
> Accessing structured data is a nice segue back to talking about attributes, and specifically about non-primitive attribute types

- Primitives data types, such as Boolean, Date, DateTime, Decimal, Double, Integer, Long, or String. The usual suspects in any programming language.
- Standard and custom Salesforce objects, such as Account or MyCustomObject__c.
- Collections, such as List, Map, and Set.
- Custom Apex classes.
- Framework-specific types, such as Aura.Component, or Aura.Component[]. 

Other Aspects of Attribute Definitions

- The **default** attribute defines the default attribute value. It’s used when the attribute is referenced and you haven’t yet set the attribute’s value.
- The **required** attribute defines whether the attribute is required. The default is false.
- The **description** attribute defines a brief summary of the attribute and its usage.

### Controllers
> Lightning Components is View-Controller-Controller-Model, or perhaps View-Controller-Controller-Database. Because when interacting with Salesforce, your components will have a server-side controller in addition to the client-side controller we’ve worked with in this unit. This dual controller design is the key difference between Lightning Components and MVC.

For Lightning Components, a controller is a resource in a component bundle that holds the action handlers for that component. And action handlers are just JavaScript functions with a particular function signature.

#### Action Handlers
The combination of name-value pair and specific function signature is an action handler. You’ll hear or see the terms action handler, controller action, and controller function used interchangeably, and for the most part that’s correct. They almost always refer to the same thing. 

- **component**—the component
- **event**—the event that caused the action handler to be called.
- **helper**—the component’s helper, another JavaScript resource of reusable functions.

### Input Data Using Forms

