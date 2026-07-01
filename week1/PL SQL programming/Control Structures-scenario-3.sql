DECLARE
    CURSOR loan_cursor IS
        SELECT c.Name,
               l.LoanID,
               l.DueDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE
                            AND SYSDATE + 30;
BEGIN

    FOR rec IN loan_cursor LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ID '
            || rec.LoanID
            || ' for '
            || rec.Name
            || ' is due on '
            || rec.DueDate
        );

    END LOOP;

END;
/