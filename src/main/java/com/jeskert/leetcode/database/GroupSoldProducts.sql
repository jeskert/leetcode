select sell_date, count(distinct product) as num_sold, GROUP_CONCAT(DISTINCT product SEPARATOR ',') as products
from activities
group by sell_date