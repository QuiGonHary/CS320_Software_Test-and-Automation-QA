# CS320_Software_Test-and-Automation-QA

Jacob S. Hary

**Project Reflection**
**How can I ensure that my code, program, or software is functional and secure?**
I make sure my code works the way it’s supposed to by testing it often and testing it early. In Project One, writing unit tests for both the Contact and ContactService classes helped me catch issues I might not have noticed just by running the program manually. Testing things like invalid inputs, duplicate contact IDs, and edge cases showed me how easy it is for bugs to slip through if you don’t actively try to break your own code.
I also focused on validating inputs and enforcing rules in the code, like making sure fields aren’t null and don’t exceed the allowed length. These small checks go a long way toward making software more reliable and safer to use. Overall, writing automated tests gave me a lot more confidence that my code does what it’s supposed to and won’t fail in unexpected ways.

**How do I interpret user needs and incorporate them into a program?**
I start by really reading the requirements and treating them like a checklist instead of suggestions. The projects made it clear that even small details in the requirements matter, like character limits or whether an ID can be changed. Once I understand what the user or system needs, I turn those requirements directly into code behavior and test cases.
For example, if the requirements say a contact ID must be unique and unchangeable, I make sure the service logic enforces that and that my unit tests confirm it. Writing tests based on requirements helped me think from the user’s perspective and made sure I wasn’t just building something that “works,” but something that works the way it’s expected to.

**How do I approach designing software?**
When designing software, I try not to do everything at once. I break the problem into smaller pieces and focus on one part at a time. In Project One, separating the data model from the service logic made the code easier to understand and easier to test. Each class had a clear purpose, which made debugging much less frustrating.
I also think about testing while I’m writing the code, not after. If something is hard to test, it’s usually a sign that it needs to be redesigned or simplified. This approach helped me write cleaner code that’s easier to maintain and expand later.

**Final Thoughts**
Working on these projects helped me better understand how important testing is in real software development. Writing unit tests, thinking about edge cases, and reflecting on my design choices showed me that quality assurance isn’t just about finding bugs, it’s about preventing them. These projects gave me practical experience with testing, automation, and writing code that meets requirements, and they’ve helped shape how I approach software development going forward.
