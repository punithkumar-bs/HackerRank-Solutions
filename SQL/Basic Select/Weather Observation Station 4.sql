-- github.com/punithkumar-bs

SELECT 
    COUNT(CITY) - COUNT(DISTINCT CITY)
FROM
    STATION;
