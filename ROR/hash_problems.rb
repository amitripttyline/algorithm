# HASH Problems 
# 1 Write a program that counts the frequency of each word in a given string.

def freq_count(string)
    hash = {}
    string.each_char do |s|
        hash[s] = hash[s] ? hash[s]+1 : 1
    end
    hash
end

string = "banana"
# puts freq_count(string)

# 2 Write a program that takes two hashes and returns a new hash containing only the key/value pairs that are common to both hashes.
def common_ele_hash(hash1, hash2)
    
    hash1.select {|k,v| hash2[k] == v}
end

    
hash1 = {a: 22, b: 33, c: 44, d: 99}
hash2 = {a: 34, b: 33, k: 44, o: 99, d: 99}
hash3 = {s: 33, }
# puts common_ele_hash(hash1, hash2)



#3. Write a program that takes a hash and returns a new hash with the keys and values swapped.
def swapped_ele_hash(hash2)
    hash={}
    hash2.each {|k,v| hash[v] = k}
    return hash
end

    
hash2 = {a: 34, b: 33, k: 44, o: 99, d: 99}
# puts swapped_ele_hash(hash2)


# 4. Write a program that takes a hash and returns a new hash with only the key/value pairs where the value is a number.
def number_hash(hash2)
    hash2.select {|k,v| v.is_a?(Integer)}
end

    
hash = {a: 34, b: 33, k: 44, o: 99, d: 99, 2 => "jsjd", "232" => "jsjsjjs", 24 => "sjsjjs", 23 => 99}
# puts number_hash(hash2)

