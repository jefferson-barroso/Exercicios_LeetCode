SELECT id, movie, description, rating 
FROM Cinema 
WHERE id IN (SELECT id FROM Cinema WHERE id % 2 <> 0) 
AND description <> 'Boring' 
ORDER BY rating DESC;
