import requests


def get_movie_by_imdb_number(imdb_number):
    r= requests.get(f'http://java:8080/api/v1/movies/{imdb_number}')
    if (r.status_code == 200):
        return r.json()
    else:
        return "ERROR"    
    
