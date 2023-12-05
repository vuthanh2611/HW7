package com.harbourspace.unsplash

import android.R.attr.height
import android.R.attr.shape
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.harbourspace.unsplash.ui.theme.UnsplashTheme


class HomeworkActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            UnsplashTheme {
                val shape = RoundedCornerShape(8.dp)
                val height = 250.dp
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top,
                ) {
                    Box(
                        modifier = Modifier
                            .height(height)
                            .fillMaxWidth(),
                        contentAlignment = Alignment.BottomStart
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bkk_loha_prasat),
                            contentDescription = stringResource(id = R.string.description_image_preview),
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape)
                        )

                        Text(
                            text = "Bangkok",
                            color = Color.White,
                            textAlign = TextAlign.Left,
                            fontSize = 19.sp,
                            fontStyle = FontStyle.Normal,
                            modifier = Modifier.padding(start = 25.dp)

                        )
                        Icon(
                            painter = painterResource(id = R.drawable.location),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )


                    }
                    Spacer(modifier = Modifier.height(12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Absolute.Left
                    ) {
                        Spacer(modifier = Modifier.width(5.dp))
                        Image(
                            painter = painterResource(id = R.drawable.diem),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(50.dp)
                                .clip(CircleShape)
                        )

                        Text(
                            text = "Nguyen Diem",
                            color = Color.White,
                            textAlign = TextAlign.Left,
                            fontSize = 22.sp,
                            fontStyle = FontStyle.Normal,
                            modifier = Modifier.padding(start = 25.dp)

                        )
                        Spacer(modifier = Modifier.width(60.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.download),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier
                                .size(30.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.favorite),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier
                                .size(30.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.bookmark),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier
                                .size(30.dp)
                        )

                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp)
                    ) {
                        Column(
                            modifier = Modifier.weight(1.0f)
                        ) {
                            Text(
                                text = stringResource(id = R.string.details_camera_title),
                                color = Color.White,
                                textAlign = TextAlign.Left,
                                fontSize = 22.sp,
                                fontStyle = FontStyle.Normal,
                                modifier = Modifier.padding(start = 25.dp)
//                                subtitle = stringResource(id = R.string.details_camera_default)
                            )

                            Text(
                                text = stringResource(id = R.string.details_camera_default),
                                color = Color.White,
                                textAlign = TextAlign.Left,
                                fontSize = 22.sp,
                                fontStyle = FontStyle.Normal,
                                modifier = Modifier.padding(start = 25.dp)
//                                subtitle = stringResource(id = R.string.details_camera_default)
                            )

                        }

                        Column(
                            modifier = Modifier.weight(1.0f)
                        ) {
                            Text(
                                text = stringResource(id = R.string.details_aperture_title),
                                color = Color.White,
                                textAlign = TextAlign.Left,
                                fontSize = 22.sp,
                                fontStyle = FontStyle.Normal,
                                modifier = Modifier.padding(start = 25.dp)
//                                subtitle = stringResource(id = R.string.details_aperture_default)
                            )
                            Text(
                                text = stringResource(id = R.string.details_aperture_default),
                                color = Color.White,
                                textAlign = TextAlign.Left,
                                fontSize = 22.sp,
                                fontStyle = FontStyle.Normal,
                                modifier = Modifier.padding(start = 25.dp)
//                                subtitle = stringResource(id = R.string.details_aperture_default)
                            )
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 16.dp)
                    ) {
                        Column(
                            modifier = Modifier.weight(1.0f)
                        ) {
                            Text(
                                text = stringResource(id = R.string.details_focal_title),
                                color = Color.White,
                                textAlign = TextAlign.Left,
                                fontSize = 22.sp,
                                fontStyle = FontStyle.Normal,
                                modifier = Modifier.padding(start = 25.dp)
//                                subtitle = stringResource(id = R.string.details_focal_default)
                            )
                            Text(
                                text = stringResource(id = R.string.details_focal_default),
                                color = Color.White,
                                textAlign = TextAlign.Left,
                                fontSize = 22.sp,
                                fontStyle = FontStyle.Normal,
                                modifier = Modifier.padding(start = 25.dp)
//                                subtitle = stringResource(id = R.string.details_focal_default)
                            )
                        }

                        Column(
                            modifier = Modifier.weight(1.0f)
                        ) {
                            Text(
                                text = stringResource(id = R.string.details_shutter_title),
                                color = Color.White,
                                textAlign = TextAlign.Left,
                                fontSize = 22.sp,
                                fontStyle = FontStyle.Normal,
                                modifier = Modifier.padding(start = 25.dp)
//                                subtitle = stringResource(id = R.string.details_shutter_default)
                            )
                            Text(
                                text = stringResource(id = R.string.details_shutter_default),
                                color = Color.White,
                                textAlign = TextAlign.Left,
                                fontSize = 22.sp,
                                fontStyle = FontStyle.Normal,
                                modifier = Modifier.padding(start = 25.dp)
                            )
//                                subtitle = stringResource(id = R.string.details_shutter_default)
                        }
                    }

                    // Add other Row elements as needed

//                     Divider
                    Spacer(modifier = Modifier.height(12.dp))
                    Divider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, end = 16.dp),
                        thickness = 1.dp,
                        color = Color.LightGray
                    )

                    // Another Row
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = stringResource(id = R.string.details_views_title),
                                color = Color.White,
                                textAlign = TextAlign.Left,
                                fontSize = 22.sp,
                                fontStyle = FontStyle.Normal,
                                modifier = Modifier.padding(start = 25.dp)
//                                subtitle = stringResource(id = R.string.details_views_default)
                            )
                            Text(
                                text = stringResource(id = R.string.details_views_default),
                                color = Color.White,
                                textAlign = TextAlign.Left,
                                fontSize = 22.sp,
                                fontStyle = FontStyle.Normal,
                                modifier = Modifier.padding(start = 25.dp)
//                                subtitle = stringResource(id = R.string.details_views_default)
                            )

                        }

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = stringResource(id = R.string.details_downloads_title),
                                color = Color.White,
                                textAlign = TextAlign.Left,
                                fontSize = 22.sp,
                                fontStyle = FontStyle.Normal,
                                modifier = Modifier.padding(start = 25.dp)
//                                subtitle = stringResource(id = R.string.details_downloads_default)
                            )
                            Text(
                                text = stringResource(id = R.string.details_downloads_default),
                                color = Color.White,
                                textAlign = TextAlign.Left,
                                fontSize = 22.sp,
                                fontStyle = FontStyle.Normal,
                                modifier = Modifier.padding(start = 25.dp)
//                                subtitle = stringResource(id = R.string.details_downloads_default)
                            )

                        }

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = stringResource(id = R.string.details_likes_title),
                                color = Color.White,
                                textAlign = TextAlign.Left,
                                fontSize = 22.sp,
                                fontStyle = FontStyle.Normal,
                                modifier = Modifier.padding(start = 25.dp)
//                                subtitle = stringResource(id = R.string.details_likes_default)
                            )
                            Text(
                                text = stringResource(id = R.string.details_likes_default),
                                color = Color.White,
                                textAlign = TextAlign.Left,
                                fontSize = 22.sp,
                                fontStyle = FontStyle.Normal,
                                modifier = Modifier.padding(start = 25.dp)

                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
//                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {

                        Button(onClick = { this@HomeworkActivity }) {
                            Text("Bangkok")

                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Button(onClick = { this@HomeworkActivity }) {
                            Text("Barcelona")
                        }

                    }



                    // Add other content to the Column if needed

                }
            }
        }
    }
}