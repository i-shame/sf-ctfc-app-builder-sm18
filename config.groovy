// title
// Base title of pages.
// Note: check encoding for the title using multi-bytes.
title = "App Builder Credential"

// The version of this document
version = "0.1"

// The path of source files directory
//sourceDirectoryPath = "."

// The path of directory to be outputted a document
outputDirectoryPath = "build"

// theme
// This setting specifies a theme.
// default: default (means ./themes/default/ )
theme = "default"

// layout
// This setting specifies a layout file which is used by default.
// default: main (means main.html in theme directory)
//layout = "main"

// inputEncoding
// The encoding of input Markdown resource.
// default: UTF-8
//inputEncoding = "UTF-8"

// outputEncoding
// The encoding of output document.
// default: UTF-8
//outputEncoding = "UTF-8"

// documentTocDepth
// The maximum depth that is used in generating a table of contents of the entire document. A Header Level can be used in this setting.
// default: 4
documentTocDepth = 1

// pageTocDepth
// The maximum depth that is used in generating a table of contents of a page. A Header Level can be used in this setting.
// default: 99
pageTocDepth = 0

// numbering
// This parameter enables the numbering of the documentation.
// default: true
numbering = false

// numberingOffset
// This parameter represents the offset to start the numbering. A Header Level can be used in this setting. This parameter is based on 0.
// default: 0
//numberingOffset = 0

// numberingDepth
// This parameter represents the depth to end the numbering. A Header Level can be used in this setting. This parameter is based on 0.
// default: 4
//numberingDepth = 4

// format
// This parameter enables the formatting of the generated document.
// default: true
//format = true

// readmeToIndex
// If a file name is README.md, Gaiden will change the file name to index.html when generating the document.
// default: true
//readmeToIndex = true

// assetTypes
// Types of asset that is copied when generating the document.
// default ['jpg', 'jpeg', 'png', 'gif']
//assetTypes = "['jpg', 'jpeg', 'png', 'gif']"

// filters
// Gaiden provides the ability to hook into building events. To create a filter, you can use Grails-like Filter DSL:
// filters = {
//     all {
//         before = { text ->
//             text.replaceAll(/MY_REPLACE_TEXT_1/, '**HELLO**')
//         }
//         after = { text ->
//             text.replaceAll(/<h2.*?>MY_REPLACE_TEXT_2<\/h2>/, '<i>BYE</i>')
//         }
//         afterTemplate = { text ->
//             text.replaceAll(/TITLE/, 'GOOD')
//         }
//     }
// }
// Each filter is defined with the filter name within the filters block. Within the body of the filter, you can define one or several of the following interceptor types for the filter:
//     before - Executed before Markdown is processed. Takes a Markdown text as an argument. The closure must return the whole text of result of filtering.
//     after - Executed after Markdown is processed. Takes a Converted HTML text as an argument. The closure must return the whole text of result of filtering.
//     afterTemplate - Executed after the layout is applied. Takes a full HTML text as an argument. The closure must return the whole text of result of filtering.

// Encoding
// The encoding of config.groovy must be same as the file.encoding system property. If you want to use another encoding, you can use JAVA_OPTS or GAIDEN_OPTS to pass JVM options to Gaiden as follows.
// For Unix:
// $ export GAIDEN_OPTS="-Dfile.encoding=UTF-8"
// For Windows:
// > set GAIDEN_OPTS="-Dfile.encoding=UTF-8"