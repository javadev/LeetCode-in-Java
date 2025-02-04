3436\. Find Valid Emails

Easy

Table: `Users`

    +-----------------+---------+
    | Column Name     | Type    |
    +-----------------+---------+
    | user_id         | int     |
    | email           | varchar |
    +-----------------+---------+
    (user_id) is the unique key for this table.
    Each row contains a user's unique ID and email address. 

Write a solution to find all the **valid email addresses**. A valid email address meets the following criteria:

*   It contains exactly one `@` symbol.
*   It ends with `.com`.
*   The part before the `@` symbol contains only **alphanumeric** characters and **underscores**.
*   The part after the `@` symbol and before `.com` contains a domain name **that contains only letters**.

Return _the result table ordered by_ `user_id` _in_ **ascending** _order_.

**Example:**

**Input:**

Users table:

    +---------+---------------------+
    | user_id | email               |
    +---------+---------------------+
    | 1       | alice@example.com   |
    | 2       | bob_at_example.com  |
    | 3       | charlie@example.net |
    | 4       | david@domain.com    |
    | 5       | eve@invalid         |
    +---------+---------------------+ 

**Output:**

    +---------+-------------------+
    | user_id | email             |
    +---------+-------------------+
    | 1       | alice@example.com |
    | 4       | david@domain.com  |
    +---------+-------------------+ 

**Explanation:**

*   **alice@example.com** is valid because it contains one `@`, alice is alphanumeric, and example.com starts with a letter and ends with .com.
*   **bob\_at\_example.com** is invalid because it contains an underscore instead of an `@`.
*   **charlie@example.net** is invalid because the domain does not end with `.com`.
*   **david@domain.com** is valid because it meets all criteria.
*   **eve@invalid** is invalid because the domain does not end with `.com`.

Result table is ordered by user\_id in ascending order.