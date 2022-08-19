Feature: Bill Pay Functionalty

  Background:
    Given Navigate to parasoft
    When Enter valid username as "group6" and password as "123456" click login button
    Then User should login successfuly

  Scenario Outline: Pay Bills frow below list
    When Click Bill Pay Link
    And Enter Payee Name as "<PayeeName>" Amount as "<Amount>" Address as "<Address>" City as "<City>" State as "<State>" ZipCode as "<ZipCode>" Phone as "<Phone>" Account as "<Account>"  click send payment button
    Then User should be payed the bill successfully

    Examples:
    | PayeeName | Amount | Address |  City  | State  | ZipCode | Phone      | Account |
    | Elektrik  | 85     |  Bursa  | Bursa  | Turkey | 12345   | 0123456789 | 123456  |
    | Su        | 45     |  Bursa  | Bursa  | Turkey | 12345   | 0123456789 | 123478  |
    | Dogalgaz  | 120    |  Bursa  | Bursa  | Turkey | 12345   | 0123456789 | 123489  |