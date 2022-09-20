## Semi-Self-Descriptive Numbers

We define a positive integer `n` to be **semi-self-descriptive** (SSD) if and only if, for every digit `d` that occurs in `n`, `d` occurs `d` times. For instance, if `n` contains the digit `7` then `7` must occur `7` times in `n`.

`1` is an SSD number because it contains the digit `1` and that digit occurs exactly once. Similarly, `4444`, `3133`, `25251555` and `62666626` are all SSD numbers. On the other hand, `141444` is not a SSD number because the digit `1` does not occur exactly once.

> You have been provided skeleton code and a few test cases to help you get started. You should not change the method signatures of any of the methods that you have been asked to implement.

### Task 1

Given a `String` that represents a positive integer, determine if this integer is an SSD number or not.

> For this task, you will implement the method `SSDNumber.isSemiSelfDescriptive`.

### Task 2

Given a length `n` and a digit `d`, compute the **largest SSD number** with `n` digits that includes the digit `d`. If there is no such SSD number then your method must throw a `NoSuchElementException`. (Note that this exception is built into Java and you need not implement this exception type.)

**Examples**

1. `n` = 5, `d` = 2: return `"33322"`
2. `n` = 5, `d` = 1: return `"44441"`
3. `n` = 5, `d` = 5: return `"55555"`
4. `n` = 8, `d` = 4: return `"44443331"`
5. `n` = 4, `d` = 2: throw `NoSuchElementException`

> For this task, you will implement the method `SSDNumber.getLargestSSDNumber`.

### Task 3

To complete this task, you must implement an iterator that allows us to iterate over all SSD numbers of a given length `n`. The iterator supports the usual `hasNext()` and `next()` methods. If there is an attempt to obtain a value from iterator when all values have been read then the iterator *should* throw an instance of `SSDIteratorDoneException`. The iterator starts with the smallest SSD number of the given length and iterates until it reaches the largest SSD number of the given length.

**Examples**

1. `n` = 1: iterate over `"1"`.
2. `n` = 2: iterate over `"22"`.
3. `n` = 3: iterate over `"122"`, `"212"`, `"221"`, `"333"`.
2. `n` = 4: iterate over `"1333"`, `"3133"`, `"3313"`, `"3331"`, `"4444"`.
3. `n` = 5: iterate over `"14444"`, `"22333"`, `"23233"`, `"23323"`, `"23332"`, `"32233"`, `"32323"`, `"32332"`, `"33223"`, `"33232"`, `"33322"`, `"41444"`, `"44144"`, `"44414"`, `"44441"`, `"55555"`.

> For this task, you should implement **both**  `SSDNumber.getSSDNumberIterator` and a class that implements the `SSDNumberIterator` interface. You should return an instance of the class you implement in `getSSDNumberIterator`. All your work should be in the `ssdnumbers` package: the iterator you implement should be in the folder `src/main/java/ssdnumbers` or it can be a `private` class.

## Submission Instructions

+ Submit your work to the Github classroom repository that was created for you.
+ **Do not alter the directory/folder structure. You should retain the structure as in this repository.**
+ Do not wait until the last minute to push your work to Github. It is a good idea to push your work at intermediate points as well. _We would recommend that you get your Git and Github workflow set up at the start._
+ You should submit your work to the `main` branch.

## What Should You Implement / Guidelines

+ You should implement all the methods that are indicated with `TODO`.
+ Passing the provided tests is the minimum requirement. Use the tests to identify cases that need to be handled. Passing the provided tests is *not sufficient* to infer that your implementation is complete and that you will get full credit. Additional tests will be used to evaluate your work. The provided tests are to guide you.
+ You can implement additional helper methods if you need to but you should keep these methods `private` to the appropriate classes.
+ You do not need to implement new classes *unless you are asked to do so*.
+ You can use additional **standard** Java libraries by importing them.
+ Do not throw new exceptions unless the specification for the method permits exceptions.

## Honour Code

By submitting your work to Github you agree to the following:

+ You did not consult with any other person for the purpose of completing this activity.
+ You did not aid any other person in the class in completing their activity.
+ You are submitting work from your own GitHub account.
+ If you consulted any external sources, such as resources available on the World Wide Web, in completing the examination then you have cited the source. (You do not need to cite class notes or Sun/Oracle Java documentation.)
+ You are not aware of any infractions of the honour code for this activity.