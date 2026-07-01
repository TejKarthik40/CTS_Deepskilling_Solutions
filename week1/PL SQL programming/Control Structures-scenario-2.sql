DECLARE
    CURSOR cust_cursor IS
        SELECT CustomerID,
               Balance
        FROM Customers;
BEGIN
    FOR rec IN cust_cursor LOOP

        IF rec.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = TRUE
            WHERE CustomerID = rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Customer '
                || rec.CustomerID
                || ' promoted to VIP.'
            );

        END IF;

    END LOOP;

    COMMIT;
END;
/

SELECT * FROM Customers;