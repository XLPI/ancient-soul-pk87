package org.xlpi.ancientsoul

class runSpec extends munit.FunSuite {

  val testInput = """In 1991, while studying computer science at University of Helsinki, Linus Torvalds began a project that later became the Linux kernel. He wrote the program specifically for the hardware he was using and independent of an operating system because he wanted to use the functions of his new PC with an 80386 processor. Development was done on MINIX using the GNU C Compiler."""

  val expectedOutput =
    """In 1991, while studying computer science
at University of Helsinki, Linus
Torvalds began a project that later
became the Linux kernel. He wrote the
program specifically for the hardware he
was using and independent of an
operating system because he wanted to
use the functions of his new PC with an
80386 processor. Development was done on
MINIX using the GNU C Compiler."""

  val expectedOutput20 =
    """In 1991, while
studying computer
science at
University of
Helsinki, Linus
Torvalds began a
project that later
became the Linux
kernel. He wrote the
program specifically
for the hardware he
was using and
independent of an
operating system
because he wanted to
use the functions of
his new PC with an
80386 processor.
Development was done
on MINIX using the
GNU C Compiler."""


  test("check textFormatter function with limit 40") {
    val actual = Run.textFormatter(inputText = testInput, 40)
    assertEquals(actual, expectedOutput)
  }

  test("check textFormatter function with limit 20") {
    val actual20 = Run.textFormatter(inputText = testInput, lineSizeLimit = 20)
    assertEquals(actual20, expectedOutput20)
  }

  test("check textFormatter function with limit 2000") {
    val actual2000 = Run.textFormatter(inputText = testInput, lineSizeLimit = 2000)
    assertEquals(actual2000, testInput)
  }
}