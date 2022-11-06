from typing import Union

from fastapi import FastAPI

import movie_info

app = FastAPI()


@app.get("/movie/{imdb_id}")
async def read_item(imdb_id: str):
    return movie_info.get_movie_by_imdb_number(imdb_id)
