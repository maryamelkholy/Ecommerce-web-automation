@smoke
Feature: search items
  Scenario Outline: search items by name
    Given user is inside homepage
    When user enters product "<name>"
    Then product shows by name

    Examples:
    |name|
    |laptop|
    |nike  |
    |book  |

  Scenario Outline: search items by sku
    Given user is inside homepage
    When user enters product "<sku>"
    Then product shows by sku

    Examples:
      |sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|