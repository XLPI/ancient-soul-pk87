# backend-challenge

After reading the Linux kernel coding style, you discover the magic of having lines of code with a maximum of 80 characters each.
So, you decide that from now on your outgoing emails will also follow a similar pattern and you decide to develop a plugin to help you with that.

Implement a function that receives:
- *any text*
- *a character limit per line*

and be able to generate a new text broken into lines with a maximum *limit of characters per line* defined.
Important note: **No words can be broken**.

**Input text example:**

"In 1991, while studying computer science at University of Helsinki, Linus Torvalds began a project that later became the Linux kernel. He wrote the program specifically for the hardware he was using and independent of an operating system because he wanted to use the functions of his new PC with an 80386 processor. Development was done on MINIX using the GNU C Compiler."
 
**Example output 40 character:**

In 1991, while studying computer science<br>
at University of Helsinki, Linus<br>
Torvalds began a project that later<br>
became the Linux kernel. He wrote the<br>
program specifically for the hardware he<br>
was using and independent of an<br>
operating system because he wanted to<br>
use the functions of his new PC with an<br>
80386 processor. Development was done on<br>
MINIX using the GNU C Compiler.<br>


**Plan**
    
- understanding requirements
- develop 3 main concepts of solving the task
- write unit tests
- choose the best solution
- improve code if possible
- think about possible load and Prod deployment and improve the code
- documentation: explain these decisions here or in comments
- follow:
  - Clean code
  - Simplicity and readability: follow KISS principle
  - Over Engineering
  - Test coverage
  - Understanding of the challenge



