CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
AS
BEGIN
    UPDATE SavingsAccounts
    SET Balance = Balance + (Balance * 0.01);

    COMMIT;
END;
/

BEGIN
    ProcessMonthlyInterest;
END;
/

SELECT * FROM SavingsAccounts;